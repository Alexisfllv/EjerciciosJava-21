package model;



public record ProductoRecord(
  //record clases finales , inmutables
  int id,
  String name,
  double price,
  boolean status
) {
}
