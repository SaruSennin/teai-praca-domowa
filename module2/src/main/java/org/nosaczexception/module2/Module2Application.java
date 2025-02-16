package org.nosaczexception.module2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Zaimplementuj sklep internetowy, który oferuje 3 warianty.
 * Podstawową funkcjonalnością jaką posiada każdy sklep jest wariant „START”. Umożliwia on na dodawanie produktów do koszyka (produkt przechowuje nazwę i cenę), oraz na ich podstawie wypisywać na oknie konsoli cenę wszystkich produktów.
 * Pakiet „PLUS” dodatkowo umożliwia doliczenie do ceny wynikowej podatku VAT. Stawka podatku VAT ma zostać uwzględniona w pliku konfiguracyjnym.
 * Pakiet „PRO” oprócz wyliczania podatku ma również możliwość wyliczenia rabatu, którego wartość jest uwzględniona w pliku konfiguracyjnym.
 * Aplikacja na start dodaje 5 dowolnych produktów z losowaną ceną (w przedziale 50-300 zł) i wyświetla ich sumaryczną cenę.
 */
@SpringBootApplication
//@EnableConfigurationProperties(Payment.class)
//@ConfigurationPropertiesScan
public class Module2Application {

    public static void main(String[] args) {
        SpringApplication.run(Module2Application.class, args);
        // wyświetlić startowe dane 5 produktow jako przykładowy ostatni koszyk użytkownika
        // utworzyć listę porduktów
        // utworzyć z application properties mini baze?
        // utworzyć logowanie się użytkownika przy pomocy danych z application properties?
        // dać możliwość wyświetlania danych dla pakietu PLUS
        // dać możliwość wyświetlenia danych dla pakietu PRO
    }

}
