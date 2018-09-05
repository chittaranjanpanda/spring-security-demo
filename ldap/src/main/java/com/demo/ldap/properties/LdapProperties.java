package com.demo.ldap.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties (prefix = "demo.ldap")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LdapProperties {
    private String domain;
    private String url;
    private String rootDn;
    private String searchFilter;
}
