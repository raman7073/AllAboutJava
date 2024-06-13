package com.raman.designpatterns.structural.facade.scenerio2.facadelayer;

import com.raman.designpatterns.structural.facade.scenerio2.system.*;

/*
   Client just want to create order. Create Order involves various steps.Now
   in creating order,let say a new step is added ,then client will also be impacted
   if it directly interacts with all these steps,And also let say if return type
   of any method got changed ,then client will get impacted.So adding facade layer
   is though optional but will be helpful here.
 */
public class OrderFacade {
    ProductDAO productDAO;
    Invoice invoice;
    Payment payment;
    SendNotification notification;

    public OrderFacade() {
        productDAO = new ProductDAO();
        invoice = new Invoice();
        payment = new Payment();
        notification = new SendNotification();
    }

    public void createOrder() {
        Product product = productDAO.getProduct(2);
        payment.makePayment();
        invoice.generateInvoice();
        notification.sendNotification();
        //order creation successful
    }

}
