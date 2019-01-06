/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;


import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class Subscriber implements MqttCallback {
     public String[] infoArray = new String[4];
Sulama sa = new Sulama();
    private final int qos = 1;
    private final String topic = "test1";
    private final MqttClient client;
    // Tek string halinde gelen mesaj
    private String msg;
    
    //parçalanmış mesaj  (0-4 arası sera 1      4-8 arası sera 2)
    //bilgiler sırasıyla  çalışma durumu - sıcalık - nem - hava durumu
    

    public Subscriber() throws MqttException {
        String host = String.format("tcp://m15.cloudmqtt.com:18345");
        String username = "cfbzblhr";
        String password = "hPHgdeX5QzD8";
        String clientId = "sulama";

        MqttConnectOptions conOpt = new MqttConnectOptions();
        conOpt.setCleanSession(true);
        conOpt.setUserName(username);
        conOpt.setPassword(password.toCharArray());

        this.client = new MqttClient(host, clientId, new MemoryPersistence());
        this.client.setCallback(this);
        this.client.connect(conOpt);

        this.client.subscribe(this.topic, qos);
    }

    public void sendMessage(String payload) throws MqttException {
        MqttMessage message = new MqttMessage(payload.getBytes());
        message.setQos(qos);
        this.client.publish(this.topic, message); // Blocking publish
    }

    /**
     * @param cause
     * @see MqttCallback#connectionLost(Throwable)
     */
    @Override
    public void connectionLost(Throwable cause) {
        System.out.println("Connection lost because: " + cause);
        System.exit(1);
    }

    /**
     * @param token
     * @see MqttCallback#deliveryComplete(IMqttDeliveryToken)
     */
    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        //Bu ne işe yarıyo bilmiorum.
    }

    /**
     * @param topic
     * @param message
     * @throws org.eclipse.paho.client.mqttv3.MqttException
     * @see MqttCallback#messageArrived(String, MqttMessage)
     */
    @Override
    public void messageArrived(String topic, MqttMessage message) throws MqttException {
         msg = new String(message.getPayload());
        
        
        
        
        
        System.out.println("Gelen mesaj : "+msg);
        messageSplit(msg);

    }

    public void messageSplit(String message) {
      infoArray = message.split("/");
      sa.gelenlerVeriler2(infoArray);
    }

    public static void main(String[] args) throws MqttException {
        Subscriber s = new Subscriber();
        login yeni = new login();
        yeni.setVisible(true);
    }
}
