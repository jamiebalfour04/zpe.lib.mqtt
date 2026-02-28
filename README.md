<h1>zpe.lib.mqtt</h1>

<p>
  This is the official MQTT plugin for ZPE.
</p>

<p>
  The plugin provides support for connecting to MQTT brokers and publishing messages.
</p>

<h2>Installation</h2>

<p>
  Place <strong>zpe.lib.mqtt.jar</strong> in your ZPE native-plugins folder and restart ZPE.
</p>

<p>
  You can also download with the ZULE Package Manager by using:
</p>
<p>
  <code>zpe --zule install zpe.lib.mqtt.jar</code>
</p>

<h2>Documentation</h2>

<p>
  Full documentation, examples and API reference are available here:
</p>

<p>
  <a href="https://www.jamiebalfour.scot/projects/zpe/documentation/plugins/zpe.lib.mqtt/" target="_blank">
    View the complete documentation
  </a>
</p>

<h2>Example</h2>

<pre>

import "zpe.lib.mqtt"

m = new mqtt()

if m->connect("192.168.1.10", 1883, "user", "pass") then
    m->publish("home/test", "Hello from ZPE!")
end if
</pre>

<h2>Notes</h2>

<ul>
  <li>Uses blocking MQTT connection.</li>
  <li>Supports QoS AT_LEAST_ONCE publishing.</li>
</ul>
