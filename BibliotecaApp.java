public class BibliotecaApp {

        // Atributos públicos
            public String nomeSistema;
                public String versao;
                    public boolean ativo;

                        // Métodos públicos
                            public void iniciarSistema() {
                                    ativo = true;
                                            System.out.println("Sistema iniciado.");
                                                }

                                                    public void exibirInformacoes() {
                                                            System.out.println("Sistema: " + nomeSistema);
                                                                    System.out.println("Versão: " + versao);
                                                                            System.out.println("Ativo: " + ativo);
                                                                                }

                                                                                    public void encerrarSistema() {
                                                                                            ativo = false;
                                                                                                    System.out.println("Sistema encerrado.");
                                                                                                        }

                                                                                                            // Método principal
                                                                                                                public static void main(String[] args) {

                                                                                                                        // Criando objeto da classe BibliotecaApp
                                                                                                                                BibliotecaApp app = new BibliotecaApp();
                                                                                                                                        app.nomeSistema = "Biblioteca Escolar";
                                                                                                                                                app.versao = "1.0";

                                                                                                                                                        app.iniciarSistema();
                                                                                                                                                                app.exibirInformacoes();

                                                                                                                                                                        System.out.println("----------------------");

                                                                                                                                                                                // Criando objeto da classe Livro
                                                                                                                                                                                        Livro livro1 = new Livro();
                                                                                                                                                                                                livro1.titulo = "Java Básico";
                                                                                                                                                                                                        livro1.autor = "Pedro Silva";
                                                                                                                                                                                                                livro1.anoPublicacao = 2020;

                                                                                                                                                                                                                        livro1.exibirDados();
                                                                                                                                                                                                                                livro1.emprestarLivro();
                                                                                                                                                                                                                                        livro1.devolverLivro();

                                                                                                                                                                                                                                                app.encerrarSistema();
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                    // Segunda classe
                                                                                                                                                                                                                                                    class Livro {

                                                                                                                                                                                                                                                        // Atributos públicos
                                                                                                                                                                                                                                                            public String titulo;
                                                                                                                                                                                                                                                                public String autor;
                                                                                                                                                                                                                                                                    public int anoPublicacao;

                                                                                                                                                                                                                                                                        // Métodos públicos
                                                                                                                                                                                                                                                                            public void exibirDados() {
                                                                                                                                                                                                                                                                                    System.out.println("Título: " + titulo);
                                                                                                                                                                                                                                                                                            System.out.println("Autor: " + autor);
                                                                                                                                                                                                                                                                                                    System.out.println("Ano: " + anoPublicacao);
                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                            public void emprestarLivro() {
                                                                                                                                                                                                                                                                                                                    System.out.println("Livro emprestado.");
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                            public void devolverLivro() {
                                                                                                                                                                                                                                                                                                                                    System.out.println("Livro devolvido.");
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        }
}