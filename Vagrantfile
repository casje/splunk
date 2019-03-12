# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  config.vm.box = "centos/7"
  config.vm.hostname = "java-app-001"
  config.vm.network "private_network", ip: "192.168.33.10"

   config.vm.provider "libvirt" do |vb|
     vb.memory = "1024"
   end
end
