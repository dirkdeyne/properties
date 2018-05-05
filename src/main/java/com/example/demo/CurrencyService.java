package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class CurrencyService {
  
  CurrencyProperties props;

  public CurrencyService(CurrencyProperties props) {
    this.props = props;
  }
  
  public void print() {
    props.getCurrs().forEach(System.err::println);
    props.getCurpairs().forEach(System.err::println);
  }
  
  
}
