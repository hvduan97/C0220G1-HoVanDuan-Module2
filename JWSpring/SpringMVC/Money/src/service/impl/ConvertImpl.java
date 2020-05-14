package service.impl;

import org.springframework.stereotype.Service;
import service.ConvertMoney;
@Service
public class ConvertImpl implements ConvertMoney {
    @Override
    public double convertMoney(double tigia, double usd) {
        return tigia*usd;
    }
}
