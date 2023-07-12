using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_12
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void toolStripButton1_Click(object sender, EventArgs e)
        {
            Environment.Exit(0);
        }

        private void toolStripButton2_Click(object sender, EventArgs e)
        {
            button1.Enabled = toolStripButton2.Checked;
            toolStripButton2.Checked = !button1.Enabled;
        }

        private void toolStripButton3_Click(object sender, EventArgs e)
        {
            toolStripButton4.Enabled = !toolStripButton3.Checked;
            toolStripButton3.Checked = toolStripButton4.Enabled;
        }

        private void toolStripButton4_Click(object sender, EventArgs e)
        {
            Label l1 = new Label();
            l1.Left = 50;
            l1.Text = "Панель";
            panel1.Controls.Add(l1);
        }

        private void toolStripButton5_Click(object sender, EventArgs e)
        {
            toolStripButton7.Checked = false;
            toolStripButton6.Checked = false;
            panel1.BackColor = Color.FromArgb(240, 240, 240);
        }

        private void toolStripButton6_Click(object sender, EventArgs e)
        {
            toolStripButton7.Checked = false;
            toolStripButton5.Checked = false;
            panel1.BackColor = Color.Red;
        }

        private void toolStripButton7_Click(object sender, EventArgs e)
        {
            toolStripButton6.Checked = false;
            toolStripButton5.Checked = false;
            panel1.BackColor = Color.Yellow;
        }
    }
}
