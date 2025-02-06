package com.epicode.EsercizioPizzeriaS5_L4.service;

import com.epicode.EsercizioPizzeriaS5_L4.model.*;
import com.epicode.EsercizioPizzeriaS5_L4.repository.ArticleDAORepository;
import com.epicode.EsercizioPizzeriaS5_L4.repository.DrinkDAORepository;
import com.epicode.EsercizioPizzeriaS5_L4.repository.PizzaDAORepository;
import com.epicode.EsercizioPizzeriaS5_L4.repository.ToppingDAORepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired ArticleDAORepository articledb;
    @Autowired PizzaDAORepository pizzadb;
    @Autowired DrinkDAORepository drinkdb;
    @Autowired ToppingDAORepository toppingdb;

//    @Autowired @Qualifier("menu") ObjectProvider<Menu> menuProvider;
//    @Autowired @Qualifier("tavolo") ObjectProvider<Table> tableProvider;
//    @Autowired @Qualifier("tavolo1") ObjectProvider<Table> table1Provider;
//    @Autowired @Qualifier("order") ObjectProvider<Order> orderProvider;
    @Autowired @Qualifier("pizza_margherita") ObjectProvider<Pizza> pizza_margheritaProvider;
    @Autowired @Qualifier("pizza_salami") ObjectProvider<Pizza> pizza_salamiProvider;
//    @Autowired @Qualifier("tavolo2") ObjectProvider<Table> table2Provider;
    @Autowired @Qualifier("water") ObjectProvider<Drink> waterProvider;
    @Autowired @Qualifier("lemonade") ObjectProvider<Drink> lemonadeProvider;
    @Autowired @Qualifier("pizza_4_stagioni")ObjectProvider<Pizza> pizza_4_stagioniProvider;
    @Autowired @Qualifier("pizza_prosciuttoEFunghi") ObjectProvider<Pizza> pizza_prosciutto_funghiProvider;
    @Autowired @Qualifier("pizza_Prosciutto")ObjectProvider<Pizza> pizza_prosciuttoProvider;
    @Autowired @Qualifier("topping_tomato")ObjectProvider<Topping> tomatoProvider;
    @Autowired @Qualifier("topping_cheese")ObjectProvider<Topping> cheeseProvider;
    @Autowired @Qualifier("topping_salami")ObjectProvider<Topping> salamiProvider;
    @Autowired @Qualifier("topping_olive")ObjectProvider<Topping> oliveProvider;
    @Autowired @Qualifier("topping_carciofi")ObjectProvider<Topping> carciofiProvider;
    @Autowired @Qualifier("topping_funghi")ObjectProvider<Topping> funghiProvider;
    @Autowired @Qualifier("topping_prosciuttoCotto")ObjectProvider<Topping> prosciutto_cottoProvider;

    public Topping createToppingTomato(){
        return tomatoProvider.getObject();
    }
    public Topping createToppingCheese(){
        return cheeseProvider.getObject();
    }
    public Topping createToppingSalami(){
        return salamiProvider.getObject();
    }
    public Topping createToppingOlive(){
        return oliveProvider.getObject();
    }
    public Topping createToppingCarciofi(){
        return carciofiProvider.getObject();
    }
    public Topping createToppingFunghi(){
        return funghiProvider.getObject();
    }
    public Topping createToppingProsciuttoCotto(){
        return prosciutto_cottoProvider.getObject();
    }



    public Pizza createPizzaMargherita(){
        return  pizza_margheritaProvider.getObject();
    }
    public Pizza createPizzaSalami(){
        return pizza_salamiProvider.getObject();
    }
    public Pizza createPizza4Stagioni(){
        return pizza_4_stagioniProvider.getObject();
    }
    public Pizza createPizzaProsciuttoeFunghi(){
        return pizza_prosciutto_funghiProvider.getObject();
    }
    public Pizza createPizzaProsciutto(){
        return pizza_prosciuttoProvider.getObject();
    }

    public Drink createWater(){
        return waterProvider.getObject();
    }
    public Drink createLemonade(){
        return lemonadeProvider.getObject();
    }

    //Creazione metodo che prende l'application context con l'oggetto Menu e mi restituisce solo l'oggetto.
//    public Menu createMenu(){
//        return  menuProvider.getObject();
//    }
//    public Table createTable(){
//        return tableProvider.getObject();
//    }
//    public Table createTable1(){
//        return table1Provider.getObject();
//    }
//    public Table createTable2(){
//        return table2Provider.getObject();
//    }
//
//    public Order createOrder(int numCoperti, Table tavolo){
//        Order o = orderProvider.getObject();
//        o.setTavolo(tavolo);
//        o.setNumCoperti(numCoperti);
//        return o;
//    }


    //JPA METHOD
    public void insertArticle(Article article){
       articledb.save(article);
        System.out.println("Articolo aggiunto al DB!");
    }

    public List<Article> getAll(){
      return articledb.findAll();
   }


    public List<Pizza> getAllPizza(){
        return  pizzadb.findAll();
    }
    public List<Topping> getAllToppings(){
        return toppingdb.findAll();
    }
    public List<Drink> getAllDrinks(){
        return drinkdb.findAll();
    }
    public List<Article> getProductsWithMustCalories(){
        List<Article> listaArticoliConMenoCalorie = articledb.findByCaloriesLessThan(30);
        return listaArticoliConMenoCalorie;
    }
    public List<Article> getArticoliTraDueImporti(){
        List<Article> listaArticoliCompresiDiPrezzo = articledb.findByPriceBetween(5.00,8.00);
        return listaArticoliCompresiDiPrezzo;
    }

}
