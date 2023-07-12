using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_13._1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            button1.Click += CentralizedEventHandler1;
            radioButton1.CheckedChanged += CentralizedEventHandler1;
            radioButton2.CheckedChanged += CentralizedEventHandler1;
            radioButton3.CheckedChanged += CentralizedEventHandler1;
            checkBox1.CheckedChanged += CentralizedEventHandler1;
            checkBox2.CheckedChanged += CentralizedEventHandler1;

            enabledToolStripMenuItem.CheckOnClick = true;
            enabledToolStripMenuItem.CheckedChanged += CentralizedEventHandler2;
            panel1CaptionПанельToolStripMenuItem.Click += CentralizedEventHandler2;
            clb.Click += CentralizedEventHandler2;
            clr.Click += CentralizedEventHandler2;
            cly.Click += CentralizedEventHandler2;
            exitToolStripMenuItem.Click += CentralizedEventHandler2;
            this.KeyDown += CentralizedEventHandler2;

            tl1.Click += CentralizedEventHandler3;
            tl2.Click += CentralizedEventHandler3;
            tl3.Click += CentralizedEventHandler3;
            tl4.Click += CentralizedEventHandler3;
            tl5.Click += CentralizedEventHandler3;
            tl6.Click += CentralizedEventHandler3;
            tl7.Click += CentralizedEventHandler3;
        }

        private void CentralizedEventHandler1(object sender, EventArgs e)
        {
            if (sender == radioButton1)
            {
                if (radioButton1.Checked)
                {
                    panel3.BackColor = Color.FromArgb(240, 240, 240);
                    clb.Checked = true;
                    clr.Checked = false;
                    cly.Checked = false;
                    tl5.Checked = true;
                    tl6.Checked = false;
                    tl7.Checked = false;
                }
            }
            else if (sender == radioButton2)
            {
                if (radioButton2.Checked)
                {
                    panel3.BackColor = Color.Red;
                    clb.Checked = false;
                    clr.Checked = true;
                    cly.Checked = false;
                    tl5.Checked = false;
                    tl6.Checked = true;
                    tl7.Checked = false;
                }
            }
            else if (sender == radioButton3)
            {
                if (radioButton3.Checked)
                {
                    panel3.BackColor = Color.Yellow;
                    clb.Checked = false;
                    clr.Checked = false;
                    cly.Checked = true;
                    tl5.Checked = false;
                    tl6.Checked = false;
                    tl7.Checked = true;
                }
            }
            else if (sender == checkBox1)
            {
                if (checkBox1.Checked)
                {
                    button1.Enabled = true;
                    tl2.Checked = false;
                    enabledToolStripMenuItem.Checked = true;
                }
                else
                {
                    button1.Enabled = false;
                    tl2.Checked = true;
                    enabledToolStripMenuItem.Checked = false;
                }
            }
            else if (sender == checkBox2)
            {
                if (checkBox2.Checked)
                {
                    panel3.Visible = true;
                }
                else
                {
                    panel3.Visible = false;
                }
            }
        }

        private void CentralizedEventHandler2(object sender, EventArgs e)
        {
            if (sender == enabledToolStripMenuItem)
            {
                if (enabledToolStripMenuItem.Checked)
                {
                    button1.Enabled = true;
                    tl2.Checked = false;
                    checkBox1.Checked = true;
                }
                else
                {
                    button1.Enabled = false;
                    tl2.Checked = true;
                    checkBox1.Checked = false;
                }
            }
            else if (sender == panel1CaptionПанельToolStripMenuItem)
            {
                Label l1 = new Label();
                l1.Left = 50;
                l1.Text = "Панель";
                panel3.Controls.Add(l1);
            }
            else if(sender == clb)
            {
                if (clb.Checked)
                {
                    cly.Checked = false;
                    clr.Checked = false;
                    panel3.BackColor = Color.FromArgb(240, 240, 240);
                    radioButton1.Checked = true;
                    tl5.Checked = true;
                    tl6.Checked = false;
                    tl7.Checked = false;
                }
            }
            else if (sender == clr)
            {
                if (clr.Checked)
                {
                    clb.Checked = false;
                    cly.Checked = false;
                    panel3.BackColor = Color.Red;
                    radioButton2.Checked = true;
                    tl5.Checked = false;
                    tl6.Checked = true;
                    tl7.Checked = false;
                }
            }
            else if (sender == cly)
            {
                if (cly.Checked)
                {
                    clb.Checked = false;
                    clr.Checked = false;
                    panel3.BackColor = Color.Yellow;
                    radioButton3.Checked = true;
                    tl5.Checked = false;
                    tl6.Checked = false;
                    tl7.Checked = true;
                }
            }
            else if (sender == exitToolStripMenuItem)
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
                    checkBox1.Checked = false;
                }
                else
                {
                    button1.Enabled = true;
                    checkBox1.Checked = true;
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
                    panel1.BackColor = Color.FromArgb(240, 240, 240);
                    radioButton1.Checked = true;
                    clb.Checked = true;
                    clr.Checked = false;
                    cly.Checked = false;
                }
            }
            else if (sender == tl6)
            {
                if (tl6.Checked)
                {
                    tl5.Checked = false;
                    tl7.Checked = false;
                    panel3.BackColor = Color.Red;
                    radioButton2.Checked = true;
                    clb.Checked = false;
                    clr.Checked = true;
                    cly.Checked = false;
                }
            }
            else if (sender == tl7)
            {
                if (tl7.Checked)
                {
                    tl5.Checked = false;
                    tl6.Checked = false;
                    panel3.BackColor = Color.Yellow;
                    radioButton3.Checked = true;
                    clb.Checked = false;
                    clr.Checked = false;
                    cly.Checked = true;
                }
            }
        }

    }
}
