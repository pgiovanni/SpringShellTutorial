package com.mypackage.SpringShell;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class PersonConverter implements Converter<String, Person> {

    Pattern pattern = Pattern.compile("\\(#(\\d+)\\).*"); //(#42) foo bar
    private final CrmService crm;

    public PersonConverter(CrmService crm) {
        this.crm = crm;
    }

    @Nullable
    @Override
    public Person convert(String source) {

        Matcher matcher = this.pattern.matcher(source);
        if(matcher.find()) {
            String group = matcher.group(1);
            if (StringUtils.hasText(group)) {
                Long id = Long.parseLong(group);
                return this.crm.findbyId(id);
            }
        }
        return null;
    }
}
