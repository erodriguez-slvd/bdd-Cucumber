package com.solvd.carina.demo;

import com.solvd.carina.demo.db.mappers.IUserMapper;
import com.solvd.carina.demo.db.mappers.IUserOrderMapper;
import com.solvd.carina.demo.db.models.User;
import com.solvd.carina.demo.db.models.UserOrder;
import com.solvd.carina.demo.utils.ConnectionFactory;
import com.zebrunner.carina.core.IAbstractTest;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

public class DBUserTest implements IAbstractTest {
    @Test
    public void getUserIdTest() {
        try (SqlSession session = ConnectionFactory.getSqlSessionFactory().openSession(true)) {
            IUserMapper userMapper = session.getMapper(IUserMapper.class);
            User user = userMapper.findById(1);
            System.out.println("Username: " + user.getUsername() + " password: " + user.getPassword());
            IUserOrderMapper userOrderMapper = session.getMapper(IUserOrderMapper.class);
            List<UserOrder> userOrder = userOrderMapper.findOrdersByUserId(1);
            System.out.println(userOrder.size());
            for (UserOrder a: userOrder) {
                System.out.println(a.getProductName());
            }
        }
    }
}
