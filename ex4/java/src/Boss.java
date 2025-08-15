class Boss extends Person {
    String cnpj;

    public void setCNPJ(String cnpj){
        this.cnpj = cnpj;
    }

    public String getCNPJ(){
        return cnpj;
    }
    
    public void BossFunction(){
        Boss b1 = new Boss();

        b1.setName("Gabriel");
        b1.setAge(25);
    }

    
}
