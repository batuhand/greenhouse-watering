/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mqttornek;


import org.eclipse.paho.client.mqttv3.*;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;


public class Subscriber implements MqttCallback {

    private final int qos = 1;
    private final String topic = "derece";
    private final MqttClient client;

  

    public Subscriber() throws MqttException {
        String host = String.format("tcp://m21.cloudmqtt.com:11377");
        String username = "jdadsahx";
        String password = "zzDHG-TfssbK";
        String clientId = "ilkay";
       

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
    }

    /**
     * @param topic
     * @param message
     * @throws org.eclipse.paho.client.mqttv3.MqttException
     * @see MqttCallback#messageArrived(String, MqttMessage)
     */
    @Override
    public void messageArrived(String topic, MqttMessage message) throws MqttException {
        System.out.println(String.format("[%s] %s", topic, new String(message.getPayload())));
    }

    public static void main(String[] args) throws MqttException{
        Subscriber s = new Subscriber();
        s.sendMessage("95");
        s.sendMessage("57");
    }
}
