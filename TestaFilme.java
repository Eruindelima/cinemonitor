class TestaFilme {

  public void mostra(){

      Filme filme = new Filme(); 
      filme.setTitulo("Homen de Ferro");
      filme.setAno(2015);
      filme.setTipo(2);

      System.out.println("O filme: " + filme.getTitulo());
      System.out.println("O ano: " + filme.getAno());
      System.out.println("O tipo: " + filme.getTipo());

  }
}