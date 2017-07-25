package dev.jibovico.apps.sharem.model;

import java.util.List;

import dev.jibovico.apps.sharem.fragment.RootsFragment.*;

/**
 * Created by HaKr on 07/08/16.
 */

public class GroupInfo {
    public String label;
    public List<Item> itemList;

    public GroupInfo(String text, List<Item> list){
        label = text;
        itemList = list;
    }
}
