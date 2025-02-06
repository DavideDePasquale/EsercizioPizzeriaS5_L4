package com.epicode.EsercizioPizzeriaS5_L4.runner;

import com.epicode.EsercizioPizzeriaS5_L4.model.Article;
import com.epicode.EsercizioPizzeriaS5_L4.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
    }
}
