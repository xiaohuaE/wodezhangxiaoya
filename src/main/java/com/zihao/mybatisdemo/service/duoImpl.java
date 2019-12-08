package com.zihao.mybatisdemo.service;

import com.zihao.mybatisdemo.mapper.duoduiduo;
import com.zihao.mybatisdemo.model.TNews;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class duoImpl implements Iduo {

    @Resource
    private duoduiduo duoduiduo;

    @Override
    public List<TNews> getAll(Map<String, Object> ran) {
        return duoduiduo.getAll(ran);
    }
}
