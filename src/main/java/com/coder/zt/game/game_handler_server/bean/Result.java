package com.coder.zt.game.game_handler_server.bean;

import java.util.List;

public class Result {

    private boolean success;
    private List<Integer> perCodes;
    private List<Integer> curCodes;

    public List<Integer> getPerCodes() {
        return perCodes;
    }
    
    public Result setPerCodes(List<Integer> perCodes) {
        this.perCodes = perCodes;
        return this;
    }

    public List<Integer> getCurCodes() {
        return curCodes;
    }
    
    public Result setCurCodes(List<Integer> curCodes) {
        this.curCodes = curCodes;
        return this;
    }

    public boolean isSucess() {
        return success;
    }

    public Result setSucess(boolean success) {
        this.success = success;
        return this;
    }
}