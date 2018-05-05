package com.example.demo;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="market")
public class CurrencyProperties {
  
  List<MarketCurrency> currs;
  
  private List<MarketCurrencypair> curpairs;
  
  
  
  public List<MarketCurrencypair> getCurpairs() {
    return curpairs;
  }

  public void setCurpairs(List<MarketCurrencypair> curpairs) {
    this.curpairs = curpairs;
  }

  public List<MarketCurrency> getCurrs() {
    return currs;
  }

  public void setCurrs(List<MarketCurrency> currs) {
    this.currs = currs;
  }
  
  public static class MarketCurrency {
    
    String name;
    String symbol;
    double minamount;
    double withfee;
    
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getSymbol() {
      return symbol;
    }
    public void setSymbol(String symbol) {
      this.symbol = symbol;
    } 
    public double getMinamount() {
      return minamount;
    }
    public void setMinamount(double minamount) {
      this.minamount = minamount;
    }
    public double getWithfee() {
      return withfee;
    }
    public void setWithfee(double withfee) {
      this.withfee = withfee;
    }
  }
  
  public static class MarketCurrencypair {
    String name;
    String symbol;
    double minamount;
    double withfee;
    
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getSymbol() {
      return symbol;
    }
    public void setSymbol(String symbol) {
      this.symbol = symbol;
    }
    public double getMinamount() {
      return minamount;
    }
    public void setMinamount(double minamount) {
      this.minamount = minamount;
    }
    public double getWithfee() {
      return withfee;
    }
    public void setWithfee(double withfee) {
      this.withfee = withfee;
    }
  }
}
