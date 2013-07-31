jellybean
=========

TW Bootcamp 

How to install Sonar
======================

We need:

    brew: ruby -e "$(curl -fsSL https://raw.github.com/mxcl/homebrew/go)"
    sonar: brew install sonar
    sonar-runner: brew install sonar-runner

To start sonar run:

    sonar console

To get metrics from the code just run:

    cd path/to/project/
    sonar-runner

How to install Jenkins
======================

We need:

    brew: ruby -e "$(curl -fsSL https://raw.github.com/mxcl/homebrew/go)"
    python: brew install python
    pip: brew install pip
    vagrant: http://downloads.vagrantup.com
    fabric: pip install fabric


Install Vagrant by installing the deb package from http://vagrantup.com/ (click
"Download Now"). Add the executable ``/opt/vagrant/bin/vagrant`` into your
PATH. Install VirtualBox by ``apt-get install virtualbox``.

First create the Vagrant box::

    vagrant box add lucid32 http://files.vagrantup.com/lucid32.box

Then bring it up and install Jenkins::

    vagrant up
    fab vagrant jenkins forward_port

Access Jenkins at: http://localhost:8080/

To install the jobs, do::

    fab vagrant jenkins_add_jellybean_build jenkins_add_jellybean_test

credits to: https://github.com/certik/vagrant-jenkins