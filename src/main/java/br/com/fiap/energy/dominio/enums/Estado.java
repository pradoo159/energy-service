package br.com.fiap.energy.dominio.enums;

public enum Estado {
        AC ("Acre") ,
        AL ("Alagoas"), 
        AP ("Amapá"), 
        AM ("Amazonas"), 
        BA ("Bahia"), 
        CE ("Ceará"), 
        DF ("Distrito Federal"), 
        ES ("Espirito Santo"), 
        GO ("Goiás"), 
        MA ("Maranhão"), 
        MT ("Mato Grosso"), 
        MS ("Mato Grosso do Sul"), 
        MG ("Minas Gerais"), 
        PA ("Pará"), 
        PB ("Paraiba"), 
        PR ("Paraná"), 
        PE ("Pernambuco"), 
        PI ("Piauí"), 
        RJ ("Rio de Janeiro"), 
        RN ("Rio Grande do Norte"), 
        RS ("Rio Grande do Sul"), 
        RO ("Rondônia"), 
        RR ("Roraima"), 
        SC ("Santa Catarina"), 
        SP ("São Paulo"), 
        SE ("Sergipe"), 
        TO ("Tocantis");

        private final String estado;

        private Estado(String estado) {
                this.estado = estado;
        }
}