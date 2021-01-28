package com.huynhbaoloc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class DatabaseInitiaizer implements InitializingBean, DisposableBean {
    private List<User> listUser = new ArrayList<>();


    // khi bean duoc khoi tao ra thi se chay code trong
    //phuong thuc nay va tao cho chung ta 4 doi tuong user
    @Override
    public void afterPropertiesSet() throws Exception {
        User user = new User(1,"Loc");
        User user1 = new User(1,"Tam");
        User user2 = new User(1,"Dat");
        User user3 = new User(1,"Duc");

        listUser.add(user);
        listUser.add(user1);
        listUser.add(user2);
        listUser.add(user3);
        System.out.println("list of user added in init method");
        for(Iterator<User> iterator = listUser.iterator(); iterator.hasNext();){
            User user4 = iterator.next();
            System.out.println(user4.toString());

        }



    }
    @Override
    public void destroy() throws Exception {
        listUser.clear();
        System.out.println("After of users removed from list in destroy() method");
        for (Iterator<User> iterator = listUser.iterator(); iterator.hasNext();){
            User user4 = iterator.next();
            System.out.println(user4.toString());
        }
        System.out.println("list is clear up");
    }


}
