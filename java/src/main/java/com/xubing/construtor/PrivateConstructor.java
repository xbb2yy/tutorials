package com.xubing.construtor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author xubing xbbjava@163.com
 * @className PrivateConstructor
 * @description TODO
 * @date 2018/5/11 9:58
 */
@Data
@AllArgsConstructor
public class PrivateConstructor {

    private Integer id;

    private PrivateConstructor() {
    }
}
