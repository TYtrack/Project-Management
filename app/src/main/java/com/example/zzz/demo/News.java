package com.example.zzz.demo;

/**
 * Created by zzz on 2017/9/5.
 */


public class News {

    private int flag;
    private String title;
    private String cont;
    private int BOOK_TYPE;

    static final public int QUANBU=0;
    static final public int KEJI =1;
    static final public int QINGCHUN=2;
    static final public int XIAOSHUO=3;
    static final public int WENXUE=4;
    static final public int YISHU=5;
    static final public int DONGMAN=6;
    static final public int YULE=7;
    static final public int DILI=8;
    static final public int SHENGHUO=9;
    static final public int JIAOYU=10;
    static final public int QITA=11;




    static final public int BORROW_BOOK=0;
    static final public int LEND_BOOK=1;

    public News(String title,String cont,int flag,int BOOK_TYPE){
        this.title=title;
        this.cont=cont;
        this.flag=flag;
        this.BOOK_TYPE=BOOK_TYPE;
    }
    public String getTitle() {
        return title;
    }
    public String getCont() {
        return cont;
    }

    public int getFlag() {
        return flag;
    }
    public int getBOOK_TYPE() {
        return BOOK_TYPE;
    }
}

