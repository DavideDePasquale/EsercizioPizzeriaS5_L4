package com.epicode.EsercizioPizzeriaS5_L4.runner;

import com.epicode.EsercizioPizzeriaS5_L4.model.Article;
import com.epicode.EsercizioPizzeriaS5_L4.model.Drink;
import com.epicode.EsercizioPizzeriaS5_L4.model.Pizza;
import com.epicode.EsercizioPizzeriaS5_L4.model.Topping;
import com.epicode.EsercizioPizzeriaS5_L4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrdersRunner implements CommandLineRunner {

   @Autowired private OrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("OrdersRunner...");
//        Article a = orderService.createPizzaSalami();
//        orderService.insertArticle(a);
//        Article b = orderService.createPizza4Stagioni();
//        orderService.insertArticle(b);
//      Article a = orderService.createLemonade();
//      orderService.insertArticle(a);
//      Article b = orderService.createWater();
//      orderService.insertArticle(b);
//Article a = orderService.createPizzaProsciuttoeFunghi();
//orderService.insertArticle(a);
//Article b = orderService.createPizzaProsciutto();
//orderService.insertArticle(b);
//        Article a = orderService.createToppingCarciofi();
//        orderService.insertArticle(a);
//        Article b = orderService.createToppingCheese();
//        orderService.insertArticle(b);
//        Article c = orderService.createToppingFunghi();
//        orderService.insertArticle(c);
//        Article d = orderService.createToppingOlive();
//        orderService.insertArticle(d);
//        Article e = orderService.createToppingSalami();
//        orderService.insertArticle(e);
//        Article f = orderService.createToppingProsciuttoCotto();
//        orderService.insertArticle(f);
//        Article g = orderService.createToppingTomato();
//        orderService.insertArticle(g);




//       List<Topping> listaArticoliTopping =  orderService.getAllToppings();
//       listaArticoliTopping.forEach(System.out::println);
//      List<Pizza> listaPizze = orderService.getAllPizza();
//      listaPizze.forEach(System.out::println);
//        List<Drink> listaDrink = orderService.getAllDrinks();
//        listaDrink.forEach(System.out::println);

        List<Article> listaProdotti = orderService.getAll();
        listaProdotti.forEach(System.out::println);

        System.out.println("LISTA PRODOTTI PIù CALORICI : ");
        List<Article> articoliPocoCalorici = orderService.getProductsWithMustCalories();
        articoliPocoCalorici.forEach(System.out::println);

        System.out.println("LISTA PRODOTTI CHE COSTANO FRA 5€ E 8€ : ");
        List<Article> articoli = orderService.getArticoliTraDueImporti();
        articoli.forEach(System.out::println);

    }
}
