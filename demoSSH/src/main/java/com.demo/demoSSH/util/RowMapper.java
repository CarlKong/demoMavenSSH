package com.demo.demoSSH.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by carlkong on 2016/8/25.
 */
public interface RowMapper {
    public Object mapRow(ResultSet rs, int index) throws SQLException;
}
