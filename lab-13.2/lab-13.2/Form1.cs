using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_13._2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            rb1.CheckedChanged += CentralizedEventHandler1;
            rb2.CheckedChanged += CentralizedEventHandler1;
            rb3.CheckedChanged += CentralizedEventHandler1;
            rb4.CheckedChanged += CentralizedEventHandler1;
            chb1.CheckedChanged += CentralizedEventHandler1;
            chb2.CheckedChanged += CentralizedEventHandler1;

            chb3.CheckOnClick = true;
            chb3.CheckedChanged += CentralizedEventHandler1;
            btn1.Click += CentralizedEventHandler2;
            clb.Click += CentralizedEventHandler2;
            clr.Click += CentralizedEventHandler2;
            clbb.Click += CentralizedEventHandler2;
            cly.Click += CentralizedEventHandler2;

            btn2.Click += CentralizedEventHandler2;
            this.KeyDown += CentralizedEventHandler2;

            tl1.Click += CentralizedEventHandler3;
            tl2.Click += CentralizedEventHandler3;
            tl3.Click += CentralizedEventHandler3;
            tl4.Click += CentralizedEventHandler3;
            tl5.Click += CentralizedEventHandler3;
            tl6.Click += CentralizedEventHandler3;
            tl7.Click += CentralizedEventHandler3;
            tl8.Click += CentralizedEventHandler3;
        }

        private void CentralizedEventHandler1(object sender, EventArgs e)
        {
            if(sender == rb1)
            {
                if (rb1.Checked)
                {
                    panel1.BackColor = Color.Aqua;
                    clb.Checked = true;
                    clr.Checked = false;
                    clbb.Checked = false;
                    cly.Checked = false;
                    tl5.Checked = true;
                    tl6.Checked = false;
                    tl7.Checked = false;
                    tl8.Checked = false;
                }
            }
            else if (sender == rb2)
            {
                if (rb2.Checked)
                {
                    panel1.BackColor = Color.Red;
                    clb.Checked = false;
                    clr.Checked = true;
                    clbb.Checked = false;
                    cly.Checked = false;
                    tl5.Checked = false;
                    tl6.Checked = true;
                    tl7.Checked = false;
                    tl8.Checked = false;
                }
            }
            else if (sender == rb3)
            {
                if (rb3.Checked)
                {
                    panel1.BackColor = Color.Blue;
                    clb.Checked = false;
                    clr.Checked = false;
                    clbb.Checked = true;
                    cly.Checked = false;
                    tl5.Checked = false;
                    tl6.Checked = false;
                    tl7.Checked = true;
                    tl8.Checked = false;
                }
            }
            else if (sender == rb4)
            {
                if (rb4.Checked)
                {
                    panel1.BackColor = Color.Yellow;
                    clb.Checked = false;
                    clr.Checked = false;
                    clbb.Checked = false;
                    cly.Checked = true;
                    tl5.Checked = false;
                    tl6.Checked = false;
                    tl7.Checked = false;
                    tl8.Checked = true;
                }
            }
            else if (sender == chb1)
            {
                if (chb1.Checked)
                {
                    button1.Enabled = true;
                    tl2.Checked = false;
                    chb3.Checked = true;
                }
                else
                {
                    button1.Enabled = false;
                    tl2.Checked = true;
                    chb3.Checked = false;
                }
            }
            else if (sender == chb2)
            {
                if (chb2.Checked)
                {
                    panel1.Visible = true;
                }
                else
                {
                    panel1.Visible = false;
                }
            }
        }

        private void CentralizedEventHandler2(object sender, EventArgs e)
        {
            if (sender == chb3)
            {
                if (chb3.Checked)
                {
                    button1.Enabled = true;
                    tl2.Checked = false;
                    chb1.Checked = true;
                }
                else
                {
                    button1.Enabled = false;
                    tl2.Checked = true;
                    chb1.Checked = false;
                }
            }
            else if (sender == btn1)
            {
                Label l1 = new Label();
                l1.Left = 50;
                l1.Text = "Панель";
                panel1.Controls.Add(l1);
            }
            else if (sender == clb)
            {
                if (clb.Checked)
                {
                    clbb.Checked = false;
                    clr.Checked = false;
                    cly.Checked = false;
                    panel1.BackColor = Color.Aqua;
                    rb1.Checked = true;
                    tl5.Checked = true;
                    tl6.Checked = false;
                    tl7.Checked = false;
                    tl8.Checked = false;
                }
            }
            else if (sender == clr)
            {
                if (clr.Checked)
                {
                    clb.Checked = false;
                    clbb.Checked = false;
                    cly.Checked = false;
                    panel1.BackColor = Color.Red;
                    rb2.Checked = true;
                    tl5.Checked = false;
                    tl6.Checked = true;
                    tl7.Checked = false;
                    tl8.Checked = false;
                }
            }
            else if (sender == clbb)
            {
                if (clbb.Checked)
                {
                    clb.Checked = false;
                    clr.Checked = false;
                    cly.Checked = false;
                    panel1.BackColor = Color.Blue;
                    rb3.Checked = true;
                    tl5.Checked = false;
                    tl6.Checked = false;
                    tl7.Checked = true;
                    tl8.Checked = false;
                }
            }
            else if (sender == cly)
            {
                if (cly.Checked)
                {
                    clb.Checked = false;
                    clbb.Checked = false;
                    clr.Checked = false;
                    panel1.BackColor = Color.Yellow;
                    rb4.Checked = true;
                    tl5.Checked = false;
                    tl6.Checked = false;
                    tl7.Checked = false;
                    tl8.Checked = true;
                }
            }
            else if (sender == btn2)
            {
                Environment.Exit(0);
            }
            else if (sender == this && e is KeyEventArgs keyEvent && keyEvent.KeyCode == Keys.F10)
            {
                Environment.Exit(0);
            }
        }

        private void CentralizedEventHandler3(object sender, EventArgs e)
        {
            if (sender == tl1)
            {
                Environment.Exit(0);
            }
            else if (sender == tl2)
            {
                if (tl2.Checked)
                {
                    button1.Enabled = false;
                    chb1.Checked = false;
                }
                else
                {
                    button1.Enabled = true;
                    chb1.Checked = true;
                }
            }
            else if (sender == tl3)
            {
                if (tl3.Checked)
                {
                    tl4.Enabled = true;
                }
                else
                {
                    tl4.Enabled = false;
                }
            }
            else if (sender == tl4)
            {
                Label l1 = new Label();
                l1.Left = 50;
                l1.Text = "Панель";
                panel3.Controls.Add(l1);
            }
            else if (sender == tl5)
            {
                if (tl5.Checked)
                {
                    tl6.Checked = false;
                    tl7.Checked = false;
                    panel1.BackColor = Color.Aqua;
                    rb1.Checked = true;
                    clb.Checked = true;
                    clr.Checked = false;
                    clbb.Checked = false;
                    cly.Checked = false;
                }
            }
            else if (sender == tl6)
            {
                if (tl6.Checked)
                {
                    tl5.Checked = false;
                    tl7.Checked = false;
                    panel1.BackColor = Color.Red;
                    rb2.Checked = true;
                    clb.Checked = false;
                    clr.Checked = true;
                    clbb.Checked = false;
                    cly.Checked = false;
                }
            }
            else if (sender == tl7)
            {
                if (tl7.Checked)
                {
                    tl5.Checked = false;
                    tl6.Checked = false;
                    panel1.BackColor = Color.Blue;
                    rb3.Checked = true;
                    clb.Checked = false;
                    clr.Checked = false;
                    clbb.Checked = true;
                    cly.Checked = false;
                }
            }
            else if (sender == tl8)
            {
                if (tl8.Checked)
                {
                    tl5.Checked = false;
                    tl6.Checked = false;
                    panel1.BackColor = Color.Yellow;
                    rb4.Checked = true;
                    clb.Checked = false;
                    clr.Checked = false;
                    clbb.Checked = false;
                    cly.Checked = true;
                }
            }
        }

    }
}
