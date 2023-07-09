
package lexicosintactico;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {
 FileNameExtensionFilter filtro= new FileNameExtensionFilter("Archivos Word y txt","docx","txt");
    File f;
    JFileChooser j= new JFileChooser();
    String data1 [][]={};
    String cabecera1[]={"No."," Token "," Tipo"};
    String path;
    int cont=0;
    int errores;
    String mensajini="";
    String tipo="";
    public Ventana() {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Error = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtATexto1 = new javax.swing.JEditorPane();
        Lineas = new javax.swing.JEditorPane();
        LineaError = new javax.swing.JEditorPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtATraducido = new javax.swing.JTextArea();
        btnTraducir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tabla);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Entrada");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 204, 0));
        jButton1.setText(">>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Tabla de Símbolos");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Error.setEditable(false);
        Error.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        Error.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Error.setForeground(java.awt.Color.blue);
        jScrollPane5.setViewportView(Error);

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jButton2.setText("Analizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txtATexto1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtATexto1.setText("DosNumeros BEGIN{\n\nDNUM primero,segundo, resultado;\nNUM verifica;\n\nIMPRIMIR(#  Programa que calcula Divisiones  #); \nWHEN (verifica<2){\nprimero=LEER(#Dame el primer numero: #+primero);\nsegundo=LEER(#Dame el segundo numero: #+segundo);\nresultado=primero/segundo;\n\nSI(primero=0){\nverifica=verifica+1;\nSI(segundo=0){\nverifica=verifica+1;\nIMPRIMIR(#No puedo dividir entre 0#);\nFIN}\nFIN}\n\nSI(segundo>0){\nIMPRIMIR(#El Resultado es: #+resultado);\nFIN}\n\nSI(segundo<0){\nIMPRIMIR(#El Resultado es: #+resultado);\nFIN}\n\nSI(segundo=0){\nIMPRIMIR(#No puedo dividir entre 0#);\nFIN}\n\nIMPRIMIR (# Ya acabe#);\nSWHEN}\n\nEND}\n");
        txtATexto1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtATexto1FocusLost(evt);
            }
        });

        Lineas.setEditable(false);
        Lineas.setText("1");
        Lineas.setOpaque(false);

        LineaError.setEditable(false);
        LineaError.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        LineaError.setForeground(java.awt.Color.red);
        LineaError.setToolTipText("");
        LineaError.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(LineaError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Lineas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lineas)
            .addComponent(LineaError)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtATexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        txtATraducido.setColumns(20);
        txtATraducido.setRows(5);
        jScrollPane1.setViewportView(txtATraducido);

        btnTraducir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnTraducir.setForeground(new java.awt.Color(255, 153, 0));
        btnTraducir.setText(">>");
        btnTraducir.setEnabled(false);
        btnTraducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraducirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Resultado: Análisis Léxico y sintáctico");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Salida en Java");
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTraducir, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4)))
                .addGap(1101, 1101, 1101))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTraducir)
                                .addGap(85, 85, 85)))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/About.png"))); // NOI18N
        jMenu1.setText("Buscar Archivo");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        jMenuItem2.setText("Abrir archivo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        HashMap <String,Integer> r = new HashMap<>();
        HashMap <String,Integer> operadores = new HashMap<>();
        HashMap <String,Integer> id = new HashMap<>();
        HashMap <String,Integer> delimitadores = new HashMap<>();
        HashMap <String,Integer> num = new HashMap<>();
        LinkedList <String> texto = new LinkedList<>();
    
        r.put("BEGIN", 0);
        r.put("END", 0);
        r.put("WORD", 0);
        r.put("ALFA", 0);
        r.put("NUM", 0);
        r.put("DNUM", 0);
        r.put("BOOL", 0);
        r.put("LNUM", 0);
        r.put("LEER", 0);
        r.put("IMPRIMIR", 0);
        r.put("WHEN", 0);
        r.put("SI", 0);
        r.put("IS", 0);
        r.put("START", 0);
        r.put("STEP", 0);
        r.put("TO", 0);
        r.put("STOP", 0);
        r.put("SWHEN", 0);
        r.put("FIN", 0);
        
        operadores.put("/", 0);
        operadores.put("*", 0);
        operadores.put("+", 0);
        operadores.put("-", 0);
        operadores.put("=", 0);
        operadores.put("==", 0);
        operadores.put("^", 0);
        operadores.put("<", 0);
        operadores.put(">", 0);
        operadores.put("||", 0);
        operadores.put("&&", 0);
        
        delimitadores.put("#", 0);
        delimitadores.put(";", 0);
        delimitadores.put("{", 0);
        delimitadores.put("}", 0);
        delimitadores.put(")", 0);
        delimitadores.put(",", 0);
        delimitadores.put("(",0);
        
        
         
        
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Token","Cantidad","Tipo"});
        
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"{}();,\"=+-*/><||&&# \n\t",true);
        String token, text = "";
        while (st.hasMoreTokens()){
            token = st.nextToken();
            if(!" ".equals(token) && !"\n".equals(token) && !"\t".equals(token)){
                if (r.containsKey(token)) {
                    r.put(token, r.get(token)+1);            
                }else {
                    if (operadores.containsKey(token)) {
                        operadores.put(token, operadores.get(token)+1);            
                    }else {
                        if (delimitadores.containsKey(token)){
                            delimitadores.put(token, delimitadores.get(token)+1);
                            if("#".equals(token)){
                                token = st.nextToken();
                                while (st.hasMoreTokens() && !"#".equals(token)){
                                    text += token;
                                    token = st.nextToken();
                                }
                                texto.add(text);
                                delimitadores.put(token, delimitadores.get(token)+1);
                                text = "";
                            }
                        }else {
                            if (id.containsKey(token)) {
                                id.put(token, id.get(token)+1); 
                            }else {
                                if(token.matches("([0-9]*)|([0-9]*.[0-9]+)")) {
                                    if (num.containsKey(token)) {
                                        num.put(token, num.get(token)+1);
                                    }else num.put(token, 1); 
                                }
                                else id.put(token, 1); 
                            }
                        }
                    }
                }
            }
        }
        
        Iterator<String> itr = r.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(r.get(token) > 0)model.addRow(new Object[]{token, r.get(token),"Palabra Reservada"});
        } 
        itr = operadores.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(operadores.get(token) > 0) model.addRow(new Object[]{token, operadores.get(token),"Operador"});
        } 
        itr = delimitadores.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(delimitadores.get(token) > 0) model.addRow(new Object[]{token, delimitadores.get(token),"Delimitador"});
        } 
        itr = id.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(id.get(token) > 0) model.addRow(new Object[]{token, id.get(token),"Identificador"});
        } 
        itr = num.keySet().iterator();
        while(itr.hasNext()){
            token = itr.next();
            if(num.get(token) > 0) {
                if(token.matches("[0-9]+"))model.addRow(new Object[]{token, num.get(token),"Número"});
                if(token.matches("[0-9]+.[0-9]+"))model.addRow(new Object[]{token, num.get(token),"Número Decimal"});
            }
        }
        itr = texto.iterator();
        while(itr.hasNext()){
            model.addRow(new Object[]{itr.next(), "1","Texto"});
            
        }
        tabla.setModel(model);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        errores=0;
        LinkedList <String> ENT = new LinkedList<>();
        LinkedList <String> DEC = new LinkedList<>();
        LinkedList <String> TEXT = new LinkedList<>();
        LinkedList <String> TAKE = new LinkedList<>();
        
        String
//                simbolo = "([=<>])",
                simbolo = "(=|<|>|==|<=|>=|!=)",
                id = "([(a-z)(A-Z)](\\w)*)",
                num = "((\\d)+)",
                dec = "((\\d)+(\\.)(\\d)+)",
                text = "((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)",
                send = "((\\s)*IMPRIMIR(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)(\\s)*(\\))(\\s)*(;))",
                //take = "((\\s)*TAKE(\\b)(\\s)*"+id+"((\\s)*(,(\\s)*"+id+"))*(\\s)*(;))",
                take = "(([.\\w\\s]*)*(\\s)*=(\\s)*LEER(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)(\\s)*(\\))(\\s)*(;))",
                operaciones = "(("+id+"|"+num+"|"+dec+")(\\s)*([+-/*](\\s)*("+id+"|"+num+"|"+dec+"))+)",
                defVal = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*(;))",
                defValVar = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*)",
                condicion = id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")((\\s)*([(&&)(||)](\\s)*"+id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")))*",
                var = "((\\s)*((NUM)|(DNUM)|(WORD))(\\b)(\\s)*("+id+"|"+defValVar+")((\\s)*(,(\\s)*("+id+"|"+defValVar+")))*(\\s)*(;))",
                main = "((\\s)*"+id+"(\\b)(\\s)*BEGIN(\\s)*(\\{)[.\\W\\w\\s]*(END(\\s)*(\\})(\\s)*)$)",
                main2 = "((\\s)*"+id+"(\\b)(\\s)*BEGIN(\\s)*(\\{))",
                main3 = "((\\s)*END(\\s)*(\\})(\\s)*)",
                
               start2 = "((\\s)*START(\\b)(\\s)*("+id+"|"+num+")(\\b)(\\s)*(=)*("+id+"|"+num+")(\\b)(\\s)*(STEP)(\\b)(\\s)*"+num+"(\\s)*[+-]?(\\s)*(\\b)(TO)(\\b)(\\s)*("+id+"|"+num+")(\\s)*(\\{))",
                start3 = "((\\s)*STOP(\\s)*(\\}))",
                when2 = "((\\s)*WHEN(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",
               when3 = "((\\s)*SWHEN(\\s)*(\\}))",
                condiciones2 = "((\\s)*SI(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",
                condiciones3 = "((\\s)*FIN(\\s)*(\\}))",
                 entero = "[0-9]*",
                decimal = "[0-9]*.[0-9]+";
                LinkedList <Integer> error = new LinkedList<>();
                StringTokenizer st = new StringTokenizer(txtATexto1.getText(),";{}",true);
                String token = "", txt = "", e;
                int i = 1, mainE = 0, start = 0, when = 0, it = 0, eB = 0;
                Error.setText("");
                if(txtATexto1.getText().matches(main)) {
                    
                    while (st.hasMoreTokens()){
                        token = st.nextToken();
                        if(st.hasMoreTokens())token = token+st.nextToken();
                        if(token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1){
                            String auxTok = st.nextToken();
                            token = token+(auxTok.substring(0,auxTok.indexOf("\n")));
                        }
                            StringTokenizer lin = new StringTokenizer(token,"\n",true);
                            while (lin.hasMoreTokens()){
                                e = lin.nextToken();
                                if("\n".equals(e)) i++;
                            }
                            
                            if(token.matches(start2)) start++;
                            if(token.matches(start3)) start--;
                            if(token.matches(when2)) when++;
                            if(token.matches(when3)) when--;
                            if(token.matches(condiciones2)) it++;
                            if(token.matches(condiciones3)) it--;
                            if((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) eB = 1;
                            
                            if((token.matches(send) || token.matches(take) || token.matches(var) || token.matches(defVal) || token.matches(main2) || token.matches(main3) || token.matches("(\\s)*(\\$)") || token.matches(start2) || token.matches(start3) || token.matches(when2) || token.matches(when3) || token.matches(condiciones2) || token.matches(condiciones3)) && eB == 0){
                               if(token.matches(take)){
                                   
                               }
                                if(token.matches(var)){
                                    StringTokenizer stTipo = new StringTokenizer(token," ,;");
                                    String tipo = stTipo.nextToken();
                                    
                                    if(tipo.contains("NUM")){
                                        
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                errores=1;
                                                break;
                                            }
                                            
                                            ENT.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("DNUM")){
                                        
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            }
                                            
                                            DEC.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("LEER")){
                                       
                                        
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La Variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            }
                                            
                                            TAKE.add(tipo);
                                        }
                                    }
                                    if(tipo.contains("WORD")){
                                       
                                        while(stTipo.hasMoreTokens()){
                                            tipo = stTipo.nextToken();
                                            
                                            if(ENT.contains(tipo) || DEC.contains(tipo) || TEXT.contains(tipo)|| TAKE.contains(tipo)){
                                                Error.setText("La variable esta repetida ("+tipo+") "+i+": \n"
                                                               + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                    txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            }
                                            
                                            TEXT.add(tipo);
                                        }
                                    }
                                }
                                if(token.matches(defVal)){
                                    StringTokenizer stComprobar = new StringTokenizer(token," \n\t=;");
                                    String ID = stComprobar.nextToken(), comprobar = "", tok = "";
                                    //System.out.print(ID);
                                    while(stComprobar.hasMoreTokens()){
                                            comprobar += stComprobar.nextToken();
                                        }
                                    
                                    if(ENT.contains(ID)){
                                        StringTokenizer stComprobarE = new StringTokenizer(comprobar,"+*/-");
                                        while(stComprobarE.hasMoreTokens()){
                                            tok = stComprobarE.nextToken();
                                            
                                            if(tok.matches(id)){
                                                if(ENT.contains(tok));
                                                else{
                                                    Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                    + "________________________________________________________________________\n"+token);
                                                    for(int j = 1; j <i; j++){
                                                        txt += "\n";
                                                    }
                                                    LineaError.setText(txt+" ¡!");
                                                     errores=1;
                                                    break;
                                                }
                                            }
                                            else{
                                                if(tok.matches(entero));
                                                else{
                                                    Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                    + "________________________________________________________________________\n"+token);
                                                    for(int j = 1; j <i; j++){
                                                        txt += "\n";
                                                    }
                                                    LineaError.setText(txt+" ¡!");
                                                     errores=1;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        if(DEC.contains(ID)){
                                            StringTokenizer stComprobarD = new StringTokenizer(comprobar,"+*/-");
                                            while(stComprobarD.hasMoreTokens()){
                                                tok = stComprobarD.nextToken();

                                                if(tok.matches(id)){
                                                    if(DEC.contains(tok));
                                                    else{
                                                        Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                        + "________________________________________________________________________\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ¡!");
                                                         errores=1;
                                                        break;
                                                    }
                                                }
                                                else{
                                                    if(tok.matches(decimal));
                                                    else{
                                                        Error.setText("ERROR SEMÁNTICO ("+tok+") "+i+": \n"
                                                                        + "________________________________________________________________________\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ¡!");
                                                         errores=1;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        else {
                                            if(TEXT.contains(ID)){
                                                   if(comprobar.matches("((((\")[.\\W\\w\\s]*(\"))|("+id+"))((\\s)*(\\+)((\\s)*((\")[.\\W\\w\\s]*(\"))|("+id+")))*)"));
                                                   else {
                                                       Error.setText("ERROR SEMÁNTICO "+i+": \n"
                                                                        + "________________________________________________________________________\n"+token);
                                                        for(int j = 1; j <i; j++){
                                                            txt += "\n";
                                                        }
                                                        LineaError.setText(txt+" ¡!");
                                                         errores=1;
                                                        break;
                                                   }
                                            }
                                            else{
                                                Error.setText("Variable no declarada "+i+": \n"
                                                                + "________________________________________________________________________\n"+token);
                                                for(int j = 1; j <i; j++){
                                                   txt += "\n";
                                                }
                                                LineaError.setText(txt+" ¡!");
                                                 errores=1;
                                                break;
                                            } 
                                        }
                                    }     
                                }
                            }
                            
                            
                            else {
                                if(token.contains("IMPRIMIR")){
                                    txtATraducido.setText("PRINT");
                                    Error.setText("Error al declarar sentencia IMPRIMIR; en la linea "+i+": \n"
                                                   + "\n"+token);
                                     errores=1;
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("NUM") || token.contains("DNUM") || token.contains("WORD")){
                                    Error.setText("Error en declaracion de variables; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("LEER")){
                                    Error.setText("Error en lectura de valor LEER  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("STOP}")){
                                    
                                    Error.setText("Cierre de Ciclo START incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("START")){
                                    
                                    Error.setText("Inicio de Ciclo START incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("SWHEN")){
                                    Error.setText("Cierre de ciclo WHEN incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                    break;
                                }
                                if(token.contains("WHEN")){
                                    Error.setText("Inicio de ciclo WHEN incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("FIN")){
                                    
                                    Error.setText("Cierre de condicion 'SI' incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("SI")){
                                   
                                    Error.setText("Inicio de SI incorrecto; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                else {
                                    Error.setText("Sintaxis Erronea en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                            }
                            
                            
                    }
                    
                }
                   
                else {
                    st = new StringTokenizer(txtATexto1.getText(),";{}",true);
                    while (st.hasMoreTokens()){
                        token = st.nextToken();
                        if(st.hasMoreTokens())token = token+st.nextToken();
                        if(token.matches("[.\\W\\w\\s]*(\\})") && st.countTokens() == 1){
                            String auxTok = st.nextToken();
                            token = token+(auxTok.substring(0,auxTok.indexOf("\n")));
                        }
                            StringTokenizer lin = new StringTokenizer(token,"\n",true);
                            while (lin.hasMoreTokens()){
                                e = lin.nextToken();
                                if("\n".equals(e)) i++;
                            }
                            if(eB == 1) break;
                            if(token.matches(start2)) start++;
                            if(token.matches(start3)) start--;
                            if(token.matches(when2)) when++;
                            if(token.matches(when3)) when--;
                            if(token.matches(condiciones2)) it++;
                            if(token.matches(condiciones3)) it--;
                            if((st.hasMoreTokens() == false && (start > 0 || when > 0 || it > 0)) || (start < 0 || when < 0 || it < 0)) eB = 1;
                            
                            if((token.matches(send) || token.matches(take) || token.matches(var) || token.matches(defVal) || token.matches(main2) || token.matches(main3) || token.matches("(\\s)*(\\$)") || token.matches(start2) || token.matches(start3) || token.matches(when2) || token.matches(when3) || token.matches(condiciones2) || token.matches(condiciones3)) && eB == 0){
                                Error.setText("Compilado Exitosamente");
                                if(token.matches(main3)) eB = 1;
                            }
                             
                            else {
                                if(token.contains("IMPRIMIR")){
                                    Error.setText("Error al declarar sentencia IMPRIMIR  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("NUM") || token.contains("DNUM") || token.contains("WORD")){
                                    Error.setText("Error en declaracion de variables  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                System.out.println("token contiene leer");
                                if(token.contains("LEER")){
                                    Error.setText("Error en lectura de valor LEER en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("STOP}")){
                                    Error.setText("Cierre de Ciclo START incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("START")){
                                    Error.setText("Inicio de Ciclo START incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("SWHEN")){
                                    Error.setText("Cierre de ciclo WHEN incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("WHEN")){
                                    Error.setText("Inicio de ciclo WHEN incorrecto  en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("FIN")){
                                    Error.setText("Cierre de condicion SI incorrecto; en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                if(token.contains("SI")){
                                    Error.setText("Inicio de SI incorrecto en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                                else {
                                    Error.setText("Sintaxis Erronea en la linea "+i+": \n"
                                                   + "\n"+token);
                                    for(int j = 1; j <i; j++){
                                        txt += "\n";
                                    }
                                    LineaError.setText(txt+" ¡!");
                                     errores=1;
                                    break;
                                }
                            }
                    }
                    if(mainE == 0) {
                        Error.setText("Cierre de Clase incorrecto en la Linea "+i+": \n"
                                       + "\n"+token);
                        for(int j = 1; j <1; j++){
                            txt += "\n";
                        }
                        LineaError.setText(txt+" ¡!");
                         errores=1;
                    }
                }
            if(errores==1){
            btnTraducir.setEnabled(false);
        }else{
             btnTraducir.setEnabled(true);
        }
               
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnTraducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraducirActionPerformed
      txtATraducido.setText("");
        String
               simbolo = "(=|<|>|==|<=|>=|!=)",
                id = "([(a-z)(A-Z)](\\w)*)",
                num = "((\\d)+)",
                dec = "((\\d)+(\\.)(\\d)+)",
                text = "((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)",
                send = "((\\s)*IMPRIMIR(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)(\\s)*(\\))(\\s)*(;))",
                //take = "((\\s)*TAKE(\\b)(\\s)*"+id+"((\\s)*(,(\\s)*"+id+"))*(\\s)*(;))",
                take = "(([.\\w\\s]*)*(\\s)*=(\\s)*LEER(\\s)*(\\()(\\s)*((((#)[.\\W\\w\\s]*(#))|("+id+"))((\\s)*(\\+)((\\s)*((#)[.\\W\\w\\s]*(#))|("+id+")))*)(\\s)*(\\))(\\s)*(;))",
                operaciones = "(("+id+"|"+num+"|"+dec+")(\\s)*([+-/*](\\s)*("+id+"|"+num+"|"+dec+"))+)",
                defVal = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*(;))",
                defValVar = "((\\s)*"+id+"(\\s)*=(\\s)*("+id+"|"+text+"|"+operaciones+"|"+num+"|"+dec+")(\\s)*)",
                condicion = id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")((\\s)*([(&&)(||)](\\s)*"+id+"(\\s)*"+simbolo+"(\\s)*("+id+"|"+num+"|"+dec+")))*",
                var = "((\\s)*((NUM)|(DNUM)|(WORD))(\\b)(\\s)*("+id+"|"+defValVar+")((\\s)*(,(\\s)*("+id+"|"+defValVar+")))*(\\s)*(;))",
                main = "((\\s)*"+id+"txtATraducidoBEGIN(\\s)*(\\{)[.\\W\\w\\s]*(END(\\s)*(\\})(\\s)*)$)",
                main2 = "((\\s)*"+id+"(\\b)(\\s)*BEGIN(\\s)*(\\{))",
                main3 = "((\\s)*END(\\s)*(\\})(\\s)*)",
                
               start2 = "((\\s)*START(\\b)(\\s)*("+id+"|"+num+")(\\b)(\\s)*(=)*("+id+"|"+num+")(\\b)(\\s)*(STEP)(\\b)(\\s)*"+num+"(\\s)*[+-]?(\\s)*(\\b)(TO)(\\b)(\\s)*("+id+"|"+num+")(\\s)*(\\{))",
                foresito = "((\\s)*FOR(\\b)(\\s)*("+id+"|"+num+")(\\b)(\\s)*(TO)(\\b)(\\s)*("+id+"|"+num+")(\\s)*)",
                start3 = "((\\s)*STOP(\\s)*(\\}))",
                when2 = "((\\s)*WHEN(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",
               when3 = "((\\s)*SWHEN(\\s)*(\\}))",
                it2 = "((\\s)*SI(\\s)*(\\()(\\s)*"+condicion+"(\\s)*(\\))(\\s)*(\\{))",
                it3 = "((\\s)*FIN(\\s)*(\\}))",
                 entero = "[0-9]*",
                step="(STEP)(\\b)(\\s)*"+num+"(\\s)*[+-]?(\\s)*(\\b)",
                to="TO(\\b)(\\s)*("+id+"|"+num+")(\\s)*(\\{)",
                decimal = "[0-9]*.[0-9]+";
                StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n");
                String token;
                while (st.hasMoreTokens()){
                    //JOptionPane.showMessageDialog(this,"Identificando Variables...");
                    token = st.nextToken();
                    
                    if(token.matches(main2))
                    {
                        
                        String tokinn="'";
                        StringTokenizer tokin = new StringTokenizer(token," \n");
                        while(tokin.hasMoreTokens()){
                            String testo="";
                            testo=testo+txtATraducido.getText();
                            tokinn=tokin.nextToken();
                            if(tokinn.contains("BEGIN")){
                                txtATraducido.setText(testo+"REM ");

                            }
                            if  (tokinn.matches(id) && tokinn.contains("BEGIN")==false  && tokinn.contains("{")==false){
                                String txt = "// Christopher Almanzar;\nimport java.util.Scanner;";
                                String txt2 = "static class lector{\n" +
                                       "        static Scanner sc = new Scanner(System.in); \n" +
                                       "        public static int leer(String texto, int variable) {\nSystem.out.println(texto);\n return sc.nextInt();\n}\n" +
                                       "        public static String leer(String texto, String variable) {\n System.out.println(texto);\n return sc.next();\n }\n" +
                                       "        public static Double leer(String texto, Double variable) {\n System.out.println(texto);\n return sc.nextDouble();\n }\n" +
                                       "    }\n" +
                                       "public static void main(String[] args) {";
                                txtATraducido.setText(txt+"\npublic  class "+testo+tokinn+"{\n"+txt2);
                                
                            }
                            if(tokinn.contains("{")){
                                txtATraducido.setText(testo+" ;\n");
                            }
                        }

                    }

                    if(token.matches(var)){
                        String a,b ="";
                        a=txtATraducido.getText();
                        
                        txtATraducido.setText(a);
                        String tokinn="";
                        StringTokenizer tokin = new StringTokenizer(token," \n,;");
                        while(tokin.hasMoreTokens()){
                                String testo="";
                                testo=testo+txtATraducido.getText();
                                tokinn=tokin.nextToken();
                                
                                if(tokinn.contains("NUM") || tokinn.contains("DNUM") || tokinn.contains("WORD")){
                                    String enteros="";
                                    if(tokinn.contains("NUM")){
                                     enteros=" AS INTEGER";
                                     b="Integer ";
                                    }
                                    if(tokinn.contains("DNUM")){
                                     enteros=" AS DOUBLE";
                                     b="Double ";
                                    }
                                    if(tokinn.contains("WORD")){
                                     enteros=" AS STRING";
                                     b="String ";
                                    }

                                    int contador=0;
                                    while(tokin.hasMoreTokens()){
                                        tokinn=tokin.nextToken();
                                        if(!tokinn.equals(";")){
                                            
                                          if(contador>=1){
                                          b+=","+tokinn+"";
                                          }else{
                                          b+=tokinn;
                                          }
                                        }
                                         
                                        contador+=1;
                                        
                                    }
                                    b+=";";
                                    System.out.println(b);
                                    txtATraducido.setText(testo+b+"--"+(new Character((char)59).toString())+"\n");
                                }

                        }
                    }

                }
                String b=txtATraducido.getText();
                b=b+"  \n";
                txtATraducido.setText(b);
                
                
                StringTokenizer st1 = new StringTokenizer(txtATexto1.getText(),"\n");
                String token1;
                while (st1.hasMoreTokens()){
                    token1 = st1.nextToken();
                  
                    if(token1.matches(start3)){
                        
                        String a=txtATraducido.getText()+"\nNEXT\n";
                        txtATraducido.setText(a);
                    }
                   if(token1.matches(when2)){
                        StringTokenizer st2= new StringTokenizer (token1,"()");
                        while(st2.hasMoreTokens()){ 
                            String tuken= st2.nextToken();
                                if( tuken.contains("=") || tuken.contains("<") || tuken.contains(">")){
                                    if(tuken.contains("=")){
                                        StringTokenizer st3= new StringTokenizer (tuken,"=");
                                        while(st3.hasMoreTokens()){
                                            String tuken2=st3.nextToken();
                                            
                                            if(st3.hasMoreTokens()==true){
                                                String a=txtATraducido.getText()+tuken2+"=";
                                                txtATraducido.setText(a);
                                            }else{
                                                String a=txtATraducido.getText()+tuken2;
                                                txtATraducido.setText(a);
                                            }
                                            
                                        }
                                    }else{
                                       String a= txtATraducido.getText()+ tuken;
                                       txtATraducido.setText(a);
                                    }
                            }
                            
                            if(tuken.contains("WHEN")){
                                String a=txtATraducido.getText()+"\nwhile( ";
                                txtATraducido.setText(a);
                                
                            }
                            if(tuken.contains("{")){
                                String a=txtATraducido.getText()+"){\n";
                                txtATraducido.setText(a);
                            }
                        }
                    }
                    if(token1.matches(when3)){
                        String a=txtATraducido.getText()+"\n \n";
                        txtATraducido.setText(a);
                    }
                    if(token1.matches(it2)){
                        StringTokenizer st2= new StringTokenizer (token1,"()");
                        while(st2.hasMoreTokens()){ 
                            String tuken= st2.nextToken();
                                if( tuken.contains("=") || tuken.contains("<") || tuken.contains(">")|| tuken.contains(">=")|| tuken.contains("<=")){
                                    if(tuken.contains("=")){
                                        StringTokenizer st3= new StringTokenizer (tuken,"=");
                                        while(st3.hasMoreTokens()){
                                            String tuken2=st3.nextToken();
                                            
                                            if(st3.hasMoreTokens()==true){
                                                String a=txtATraducido.getText()+tuken2+"==";
                                                txtATraducido.setText(a);
                                            }else{
                                                String a=txtATraducido.getText()+tuken2;
                                                txtATraducido.setText(a);
                                            }
                                            
                                        }
                                    }else{
                                       String a= txtATraducido.getText()+ tuken;
                                       txtATraducido.setText(a);
                                    }
                            }
                            
                            if(tuken.contains("SI")){
                                String a=txtATraducido.getText()+"\nif(";
                                txtATraducido.setText(a);
                                
                            }
                            if(tuken.contains("{")){
                                String a=txtATraducido.getText()+"){\n";
                                txtATraducido.setText(a);
                            }
                        }
                    }
                    if(token1.matches(it3)){
                        String a=txtATraducido.getText()+"\n} \n";
                        txtATraducido.setText(a);
                    }
                    if(token1.matches(main3)){
                        
                        String c=txtATraducido.getText()+"}\n}\n}";
                        txtATraducido.setText(c);
                    }
                    if(token1.matches(take)){
                        StringTokenizer st2 = new StringTokenizer(token1,"()");
                        while(st2.hasMoreTokens()){
                            String tuken=st2.nextToken();
                            if(tuken.contains("LEER")){
                                String a=txtATraducido.getText()+"\n"+tuken.replace("LEER", "lector.leer(");
                                a=a.replace('#','"');
                                txtATraducido.setText(a);
                            }
                            if(tuken.contains("+")){
                                String tokesito;
                                StringTokenizer tuk= new StringTokenizer(tuken,"+");
                                while(tuk.hasMoreTokens()){
                                    tokesito=tuk.nextToken();
                                    if(tuk.hasMoreTokens()){
                                        String a=txtATraducido.getText()+tokesito+",";
                                        a=a.replace('#','"');
                                        txtATraducido.setText(a);
                                    }else{
                                        String a=txtATraducido.getText()+tokesito;
                                        a=a.replace('#','"');
                                        
                                        txtATraducido.setText(a);
                                    }
                                }
                            }
                             
                          
                            
                            if (tuken.contains(";")) {
                                String a=txtATraducido.getText()+");\n";
                                a=a.replace('#','"');
                                txtATraducido.setText(a);
                                
                            }
                            if(tuken.contains("LEER")==false && tuken.contains("+")==false && tuken.contains(";")==false){
                                String a=txtATraducido.getText()+tuken;
                                a=a.replace('#','"');
                                txtATraducido.setText(a);
                            }
                        }
                    }
                    
                     
                    
                    
                     if(token1.matches(send)){
                        StringTokenizer st2 = new StringTokenizer(token1,"()");
                        while(st2.hasMoreTokens()){
                            String tuken=st2.nextToken();
                            if(tuken.contains("IMPRIMIR")){
                                
                                String a=txtATraducido.getText()+"\nSystem.out.println(";
                                a=a.replace('#','"');
                                
                                txtATraducido.setText(a);
                            }
                            if(tuken.contains("+")){
                                String tokesito;
                                StringTokenizer tuk= new StringTokenizer(tuken,"+");
                                while(tuk.hasMoreTokens()){
                                    tokesito=tuk.nextToken();
                                    if(tuk.hasMoreTokens()){
                                        String a=txtATraducido.getText()+tokesito+"+";
                                        a=a.replace('#','\"');
                                        txtATraducido.setText(a);
                                    }else{
                                        String a=txtATraducido.getText()+tokesito;
                                        a=a.replace('#','"');
                                        txtATraducido.setText(a);
                                    }
                                }
                            }
                            
                            if (tuken.contains(";")) {
                                String a=txtATraducido.getText()+"); \n";
                                a=a.replace("#","\"");
                                txtATraducido.setText(a);
                            }
                            if(tuken.contains("IMPRIMIR")==false && tuken.contains("+")==false && tuken.contains(";")==false){
                                String a=txtATraducido.getText()+tuken;
                                a=a.replace("#","\"")+"";
                                
                                txtATraducido.setText(a);
                            }
                        }
                    }
                    
                    if(token1.matches(defVal)){
                        String tokesito;
                         StringTokenizer tuk= new StringTokenizer(token1);
                        while(tuk.hasMoreTokens()){
                           tokesito=tuk.nextToken();
                           String a=txtATraducido.getText()+tokesito+"\n";
                           //a=a.replace(';',' ');
                           txtATraducido.setText(a);
                        }
                        
                    //JOptionPane.showMessageDialog(this,"Se encontro una operación");
                    
                    }
                    
                    if(token1.matches(start2)){ 
                        String tokesito="";
                        String texto="";
                         StringTokenizer tuk= new StringTokenizer(token1,"\\s");
                        while(tuk.hasMoreTokens()){
                           tokesito=tuk.nextToken();
                           String a=txtATraducido.getText()+"\n";
                           tokesito=tokesito.replace("START","FOR");
                           tokesito=tokesito.replaceAll(step," ");
                            tokesito=tokesito.replace("{","\n");
                           texto+=a+tokesito;
                           txtATraducido.setText(texto);
                           
                        }
                       
                    JOptionPane.showMessageDialog(this,"Se encontro un ciclo for");
                    
                    }
                    
                   
              
                }

    }//GEN-LAST:event_btnTraducirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //Se crea un jfilechooser
        j.setCurrentDirectory(new File("src\\lexicosintactico"));
        j.getSelectedFile();
        j.setFileFilter(filtro);
        j.showOpenDialog(j);

        int contPalabra=0;
        try{
            path= j.getSelectedFile().getAbsolutePath();
            String name=j.getSelectedFile().getName();
            String lectura="";
            f = new File(path);

            try{

                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String aux;
                //Aqui cuento cuantas palabras hay
                StreamTokenizer st=new StreamTokenizer(new FileReader(f));
                while(st.nextToken()!=StreamTokenizer.TT_EOF){
                    if(st.ttype==StreamTokenizer.TT_WORD){
                        contPalabra++;

                    }

                }

                while((aux = br.readLine())!=null)

                lectura = lectura+aux+"\n";

            }catch(IOException e){}

            txtATexto1.setText(lectura);
            int contador=0;
            StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n",true);
            String Text = "",token;
            contador = 1;

            while (st.hasMoreTokens()){
                token= st.nextToken();
                if("\n".equals(token)) contador++;
            }

            for(int i = 1; i <= contador; i++){
                Text += i+"\n";
            }
            Lineas.setText(Text);

        }catch(NullPointerException e){

            javax.swing.JOptionPane.showMessageDialog(j, "Has seleccionado cerrar programa, saliendo...");

            System.exit(0);

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtATexto1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtATexto1FocusLost
        StringTokenizer st = new StringTokenizer(txtATexto1.getText(),"\n",true);
        String txt = "",token;
        LineaError.setText("");
        Error.setText("");
        cont = 1;
        while (st.hasMoreTokens()){
            token= st.nextToken();
            if("\n".equals(token)) cont++;
        }
        for(int i = 1; i <= cont; i++){
            txt += i+"\n";
        }
        Lineas.setText(txt);
    }//GEN-LAST:event_txtATexto1FocusLost

    
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
        
       
    }         
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane Error;
    private javax.swing.JEditorPane LineaError;
    private javax.swing.JEditorPane Lineas;
    private javax.swing.JButton btnTraducir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel panel1;
    private javax.swing.JTable tabla;
    private javax.swing.JEditorPane txtATexto1;
    private javax.swing.JTextArea txtATraducido;
    // End of variables declaration//GEN-END:variables
}
