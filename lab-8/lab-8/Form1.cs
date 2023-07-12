using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_8
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            panel = new Panel();
            panel.Location = new System.Drawing.Point(57, 100);
            panel.Size = new System.Drawing.Size(200, 200);
            this.Controls.Add(panel);

            // Запускаємо таймер на 2 секунди
            Timer timer = new Timer();
            timer.Interval = 1000;
            timer.Tick += new EventHandler(Timer_Tick);
            timer.Start();
        }
        private void Timer_Tick(object sender, EventArgs e)
        {
            // Зупиняємо таймер
            Timer timer = (Timer)sender;
            timer.Stop();

            button2 = new Button();
            button2.Text = "Button2";
            button2.Location = new System.Drawing.Point(10, 10);
            button2.Size = new System.Drawing.Size(100, 30);
            button2.Click += new EventHandler(button2_Click);
            panel.Controls.Add(button2);
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Environment.Exit(0);
        }
    }
}
