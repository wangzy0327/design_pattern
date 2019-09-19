package com.geely.design.pattern.behavioral.memento;

import java.util.Stack;

public class ArticleMementoManager {

    private final Stack<ArticleMemento> ARTICLE_MEMETO_STACK = new Stack<>();

    public ArticleMemento getMemento(){
        ArticleMemento articleMemento = ARTICLE_MEMETO_STACK.pop();
        return articleMemento;
    }

    public void addMemento(ArticleMemento articleMemento){
        ARTICLE_MEMETO_STACK.push(articleMemento);
    }

}
