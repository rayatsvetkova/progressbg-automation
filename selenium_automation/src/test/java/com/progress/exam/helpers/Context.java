package com.progress.exam.helpers;

import java.util.ArrayList;
import java.util.List;

public class Context {
    public String username;
    public String password;
    public double totalPrice =0d;
    public List<ItemDetails> items= new ArrayList<>();
    public List<String> expectedSortedItemsByName = new ArrayList<>();
    public List<String> actualSortedItemsByName = new ArrayList<>();
}
