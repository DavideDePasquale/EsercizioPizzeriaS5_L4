package com.epicode.EsercizioPizzeriaS5_L4.configuration;

import com.epicode.EsercizioPizzeriaS5_L4.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@PropertySource("application.properties")
public class MenuConfiguration {
    @Bean(name = "topping_tomato")
    public Topping toppingTomato(){
        return new Topping(0,0,"Tomato");
    }
    @Bean(name = "topping_cheese")
    public Topping toppingCheese(){
        return new Topping(92,0.69,"Cheese");
    }
    @Bean(name = "topping_salami")
    public Topping toppingSalami(){
        return new Topping(86,0.99,"Salami");
    }
    @Bean(name = "topping_olive")
    public Topping toppingOlive(){
        return new Topping(45,1.50,"Olive");
    }
    @Bean(name = "topping_carciofi")
    public Topping toppingCaciofi(){
        return new Topping(29,0.60,"Carciofi");
    }
    @Bean(name = "topping_funghi")
    public Topping toppingFunghi(){
        return new Topping(40,1.90,"Funchi Champignon");
    }
    @Bean(name = "topping_prosciuttoCotto")
    public Topping toppingProsciuttoCotto(){
        return new Topping(65,1.00,"Prosciutto Cotto");
    }

    @Bean(name = "pizza_margherita")
    public Pizza pizzaMargheritaBean(){
        Pizza p = new Pizza(1104,4.99,"Pizza Margherita");
        p.addTopping(toppingTomato());
        p.addTopping(toppingCheese());
        return p;
    }

    @Bean(name = "pizza_salami")
    public Pizza pizzaSalamiBean(){
        Pizza p = new Pizza(1160,5.99,"Salami Pizza");
        p.addTopping(toppingTomato());
        p.addTopping(toppingCheese());
        p.addTopping(toppingSalami());
        return p;
    }
    @Bean(name = "pizza_4_stagioni")
    public Pizza pizza4stagioni(){
        Pizza p = new Pizza(1250,8.50,"Pizza 4 Stagioni");
        p.addTopping(toppingTomato());
        p.addTopping(toppingFunghi());
        p.addTopping(toppingCaciofi());
        p.addTopping(toppingOlive());
        p.addTopping(toppingProsciuttoCotto());
        return p;
    }
    @Bean(name = "pizza_prosciuttoEFunghi")
    public Pizza pizzaProsciuttoFunghi(){
        Pizza p = new Pizza(1200,7.99,"Pizza Prosciutto e Funghi");
        p.addTopping(toppingTomato());
        p.addTopping(toppingFunghi());
        p.addTopping(toppingProsciuttoCotto());
        return p;
    }
    @Bean(name = "pizza_Prosciutto")
    public Pizza pizzaConProsciutto(){
        Pizza p = new Pizza(1100,6.99,"Pizza con Prosciutto Cotto");
        p.addTopping(toppingTomato());
        p.addTopping(toppingCheese());
        p.addTopping(toppingProsciuttoCotto());
        return p;
    }

    @Bean(name = "water")
    public Drink waterDrink(){
        return new Drink(0,1.29,"Water");
    }

    @Bean(name = "lemonade")
    public Drink lemonadeDrink(){
        return new Drink(128,1.29,"Lemonade");
    }
//    @Bean(name = "menu")
//    public Menu menuBean(){
//        Menu menu = new Menu();
//        menu.getMenuList().add(pizzaMargheritaBean());
//        menu.getMenuList().add(pizzaSalamiBean());
//        menu.getMenuList().add(toppingTomato());
//        menu.getMenuList().add(toppingCheese());
//        menu.getMenuList().add(toppingSalami());
//        menu.getMenuList().add(waterDrink());
//        menu.getMenuList().add(lemonadeDrink());
//        return menu;
//    }
//    @Bean(name = "tavolo")
//    public Table getTavolo(){
//        return new Table(1,4,true);
//    }
//    @Bean(name = "tavolo1")
//    public Table getTavolo1(){
//        return new Table(2,6,true);
//    }
//    @Bean(name = "tavolo2")
//    public Table getTavolo2(){
//        return new Table(3,2,true);
//    }
//
//    @Bean(name = "order1")
//    @Scope("prototype")
//    public Order getOrder1(){
//        return new Order();
//    }


}
