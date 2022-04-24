package ru.ozon.config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${launch}.properties")
public interface WebConfig extends Config {

    @Key("browsername")
    String browserName();

    @Key("browserversion")
    String browserVersion();

    @Key("browsersize")
    String browserSize();

    @Key("remoteurl")
    String remoteUrl();
}
