using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_11
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent(); 
            this.KeyPreview = true; 
            this.KeyDown += new KeyEventHandler(Form1_KeyDown);
        }

        private void enabledToolStripMenuItem_Click(object sender, EventArgs e)
        {
            button1.Enabled = !enabledToolStripMenuItem.Checked;
            enabledToolStripMenuItem.Checked = button1.Enabled;
        }

        private void ExitToolStripMenuItem_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void clBtnFaceToolStripMenuItem_Click(object sender, EventArgs e)
        {
            clRedToolStripMenuItem.Checked = false;
            clBlueToolStripMenuItem.Checked = false;
            clYellowToolStripMenuItem.Checked = false;
            panel1.BackColor = Color.Aqua;
        }

        private void clRedToolStripMenuItem_Click(object sender, EventArgs e)
        {
            clBtnFaceToolStripMenuItem.Checked = false;
            clBlueToolStripMenuItem.Checked = false;
            clYellowToolStripMenuItem.Checked = false;
            panel1.BackColor = Color.Red;
        }

        private void clBlueToolStripMenuItem_Click(object sender, EventArgs e)
        {
            clBtnFaceToolStripMenuItem.Checked = false;
            clRedToolStripMenuItem.Checked = false;
            clYellowToolStripMenuItem.Checked = false;
            panel1.BackColor = Color.Blue;
        }

        private void clYellowToolStripMenuItem_Click(object sender, EventArgs e)
        {
            clBtnFaceToolStripMenuItem.Checked = false;
            clRedToolStripMenuItem.Checked = false;
            clBlueToolStripMenuItem.Checked = false;
            panel1.BackColor = Color.Yellow;
        }

        private void Form1_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.F10 && e.Modifiers == Keys.None)
                this.Close();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            this.Focus();
        }

        private void panel1ColorToolStripMenuItem_Click(object sender, EventArgs e)
        {
            
        }

        private void panel1CaptionПанельToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Label l1 = new Label();
            l1.Left = 50;
            l1.Text = "Панель";
            panel1.Controls.Add(l1);
        }

    }
}
