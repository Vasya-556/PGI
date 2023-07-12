using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace lab_9
{
    public partial class Form1 : Form
    {
        int dx = 0, dy = 5;
        Timer timer1 = new Timer();
        public Form1()
        {
            InitializeComponent();
            timer1.Interval = 10;
            timer1.Tick += new EventHandler(timer1_Tick);
            timer1.Start();
        }

        
        private void Form1_KeyDown_1(object sender, KeyEventArgs e)
        {
            // лінивий об'єкт
            if (e.KeyCode == Keys.Left)
                label1.Left -= dx;
            if (e.KeyCode == Keys.Right)
                label1.Left += dx;
            if (e.KeyCode == Keys.Up)
                label1.Top -= dy;
            if (e.KeyCode == Keys.Down)
                label1.Top += dy;
            //свідомий об'єкт
            if (e.KeyCode == Keys.Left)
            {
                dx = -5;
                dy = 0;
            }
            if (e.KeyCode == Keys.Right)
            {
                dx = 5;
                dy = 0;
            }
            if (e.KeyCode == Keys.Up)
            {
                dx = 0;
                dy = -5;
            }
            if (e.KeyCode == Keys.Down)
            {
                dx = 0;
                dy = 5;
            }
            if (e.KeyCode == Keys.Space)
            {
                dx = 0;
                dy = 0;
            }
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            label1.Left += dx;
            label1.Top += dy;
            if (label1.Top <= 0 || label1.Top + label1.Height >= this.panel1.Height)
                dy = -dy;
            if (label1.Left <= 0 || label1.Left + label1.Width >= this.panel1.Width)
                dx = -dx;
            if ((label1.Left + label1.Width >= label2.Left &&
                label1.Left + label1.Width <= label2.Left + label2.Width
                ||
                label1.Left >= label2.Left &&
                label1.Left <= label2.Left + label2.Width)
                &&
                (label1.Top + label1.Height >= label2.Top &&
                label1.Top + label1.Height <= label2.Top + label2.Height
                ||
                label1.Top >= label2.Top &&
                label1.Top <= label2.Top + label2.Height))
            {
                timer1.Stop();
                MessageBox.Show("Game over!");
            }
        }
    }
}
