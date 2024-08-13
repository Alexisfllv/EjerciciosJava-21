package Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
    private String name;
    private double price;

}
