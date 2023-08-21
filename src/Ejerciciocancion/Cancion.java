
package Ejerciciocancion;

public class Cancion {
    /*ojalá los atributos primeros
    */
    private String titulo;
    private String artista;
    private int minutos;
    private int segundos;
    private boolean favorita;
    private boolean descargado;
    private String duracion;

   
    public Cancion(String titulo, String artista, int minutos, int segundos, boolean favorita, boolean descargado){
        this.titulo = titulo;
        this.artista = artista;
        this.minutos = minutos;
        this.segundos = segundos;
        this.favorita = favorita;
        this.descargado = descargado;
        this.duracion = minutos + ":" + segundos;
    }
/*public = puedo llamar el método de la clase en el main,
    private = solo puedo usar el método en su respectiva clase
    */
    public Cancion(){
/*Si no hago un constructor vacio no voy a poder hacer objetos vacios*/
}
    /*Con void puedo imprimir directamente, sin void tengo que retornar*/
    public void reproducirCanciones(){
        System.out.println("Se está reproduciendo: " + this.titulo);
        
    }
    
    public void adelantarCancion(int segundos){
        int minutosAdelantados = segundos / 60;
        if (minutosAdelantados > this.minutos) {
            System.out.println("Adelantaste mucho ");
        } else {
            int segundosAdelantar = segundos % 60;
            if (segundosAdelantar > this.segundos) {
                System.out.println("Te pasaste ");
            } else {
                System.out.println("Adelantaste hasta " + minutosAdelantados + " : " + segundosAdelantar);
            }
        
        }
    
    }
    
    public void verCanciones(){
          
        System.out.println("Titulo > " + this.titulo + " Artista > " + this.artista + " Duración > " + this.duracion);
    }
    
    public void largaCorta(){
        if (this.minutos > 4){
            System.out.println("La canción es larga");
        } else if (this.minutos > -1){
            System.out.println("La canción es normal");
        } else {
            System.out.println("Que es esta mierda");
        }
        
    }
    
    public String getTitulo() {
        return this.titulo;
    /*Cuando el objeto cancion llame al metodo getTitulo, le devolverá su título
        */
    }
/*
    setTitulo sirve para definir o redefinir los atributos de un objeto
    */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        
        if (minutos < 60 && minutos > 0){
            this.minutos = minutos;
        } else {
            System.out.println("Te equivocaste, tiene que ser menos de 60 segundos");
        }   
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public boolean isDescargado() {
        return descargado;
    }

    public void setDescargado(boolean descargado) {
        this.descargado = descargado;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", minutos=" + minutos + ", segundos=" + segundos + ", favorita=" + favorita + ", descargado=" + descargado + ", duracion=" + duracion + '}';
    }
    
    
    
   
    
    
}
