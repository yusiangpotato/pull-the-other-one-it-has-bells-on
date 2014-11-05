package appname.util;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Created by yusiang on 11/5/14.
 */
public class priorityArrayList<T extends Comparable> extends ArrayList<T> {

    @Override
    public boolean add(T t) {
        int i;
        boolean y=false;
        for(i=0;i<this.size();i++) {
            if (this.get(i).compareTo(t) < 0) {
                y = true;
                break;
            }
        }
        if(y){
            super.add(i,t);
            return true;
        }else{
            return super.add(t);
        }
    }

    @Override
    public void add(int index, T element) {
        this.add(element);
    }
}