package com.beng.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 * 
 * @author apple
 */
public class ConcreteAggregate {

    private List<Object> list = new ArrayList<>();

    public ConcreteAggregate() {
    }

    public ConcreteAggregate(List<Object> list) {
        this.list = list;
    }

    public void addObject(Object obj) {
        this.list.add(obj);
    }

    public void removeObject(Object obj) {
        this.list.remove(obj);
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public MyIterator createIterator() {
        return new ConcreteIterator();
    }

    // 使用内部类定义迭代器，可以直接使用外部类的属性
    private class ConcreteIterator implements MyIterator {

        private int cursor; // 定义游标记录遍历位置

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (cursor < list.size())
                cursor++;
        }

        @Override
        public boolean hasNext() {
            return cursor < list.size() ? true : false;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0 ? true : false;
        }

        @Override
        public boolean isLast() {
            return cursor == (list.size() - 1) ? true : false;
        }

        @Override
        public Object getCurrentObject() {
            return list.get(cursor);
        }

    }

}
