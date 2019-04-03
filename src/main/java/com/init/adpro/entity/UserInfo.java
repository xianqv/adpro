/**
 * Copyright (C), 2015-2019, 上海并擎科技有限公司
 * FileName: UserInfo
 * Author:   haigang
 * Date:     2019/4/3 2:33 PM
 * Description: gengeral userinfo
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.init.adpro.entity;

import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈gengeral userinfo〉
 *
 * @author haigang
 * @create 2019/4/3
 * @since 1.0.0
 */
public @Data class UserInfo {
        private String id;
        private String name;
        private String account;
        private String password;
}