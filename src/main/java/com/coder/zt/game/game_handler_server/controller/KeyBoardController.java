package com.coder.zt.game.game_handler_server.controller;


import java.awt.event.KeyEvent;
import java.util.List;

import com.coder.zt.game.game_handler_server.bean.Result;

import java.awt.Robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/keyboard")
public class KeyBoardController {
    
    // @Autowired
    // private Robot robot;

    @PostMapping("/keys")
    public Result doWithKeys(@RequestBody Result keycode){
        System.out.println("处理监听");
        List<Integer> curCodes = keycode.getCurCodes();
        List<Integer> perCodes = keycode.getPerCodes();
        for(Integer code: perCodes){
            
            if(!curCodes.contains(code)){
                //释放code
                System.out.println("释放code ---> " + code);
            }
        }
        for(Integer code: curCodes){
            if(!perCodes.contains(code)){
                //按下code
                System.out.println("按下code ---> " + code);
            }
            
        }
        return new Result().setSucess(true).setPerCodes(null).setCurCodes(curCodes);
    }

}