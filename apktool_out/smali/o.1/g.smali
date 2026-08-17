.class public Lo/g;
.super Landroidx/lifecycle/T;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo/g$d;,
        Lo/g$b;,
        Lo/g$c;
    }
.end annotation


# instance fields
.field private b:Ljava/util/concurrent/Executor;

.field private c:Lo/f$a;

.field private d:Lo/f$d;

.field private e:Lo/f$c;

.field private f:Lo/a;

.field private g:Lo/h;

.field private h:Landroid/content/DialogInterface$OnClickListener;

.field private i:Ljava/lang/CharSequence;

.field private j:I

.field private k:Z

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:Landroidx/lifecycle/A;

.field private q:Landroidx/lifecycle/A;

.field private r:Landroidx/lifecycle/A;

.field private s:Landroidx/lifecycle/A;

.field private t:Landroidx/lifecycle/A;

.field private u:Z

.field private v:Landroidx/lifecycle/A;

.field private w:I

.field private x:Landroidx/lifecycle/A;

.field private y:Landroidx/lifecycle/A;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/lifecycle/T;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lo/g;->j:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lo/g;->u:Z

    .line 9
    .line 10
    iput v0, p0, Lo/g;->w:I

    .line 11
    .line 12
    return-void
.end method

.method private static c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroidx/lifecycle/A;->n(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/lifecycle/A;->l(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method A()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo/g;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method B()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo/g;->n:Z

    .line 2
    .line 3
    return v0
.end method

.method C()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->v:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->v:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->v:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method D()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo/g;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method E()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo/g;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method F()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->t:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->t:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->t:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method G()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo/g;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method H(Lo/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->q:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->q:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->q:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method I(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->s:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->s:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->s:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method J(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->r:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->r:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->r:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method K(Lo/f$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->p:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->p:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->p:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method L(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/g;->l:Z

    .line 2
    .line 3
    return-void
.end method

.method M(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo/g;->j:I

    .line 2
    .line 3
    return-void
.end method

.method N(Lo/f$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/g;->c:Lo/f$a;

    .line 2
    .line 3
    return-void
.end method

.method O(Ljava/util/concurrent/Executor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/g;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-void
.end method

.method P(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/g;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method Q(Lo/f$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/g;->e:Lo/f$c;

    .line 2
    .line 3
    return-void
.end method

.method R(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/g;->n:Z

    .line 2
    .line 3
    return-void
.end method

.method S(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->v:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->v:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->v:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method T(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/g;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method U(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->y:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->y:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->y:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method V(I)V
    .locals 0

    .line 1
    iput p1, p0, Lo/g;->w:I

    .line 2
    .line 3
    return-void
.end method

.method W(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->x:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->x:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->x:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method X(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/g;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method Y(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->t:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->t:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->t:Landroidx/lifecycle/A;

    .line 13
    .line 14
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v0, p1}, Lo/g;->c0(Landroidx/lifecycle/A;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method Z(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/g;->i:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method a0(Lo/f$d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo/g;->d:Lo/f$d;

    .line 2
    .line 3
    return-void
.end method

.method b0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lo/g;->k:Z

    .line 2
    .line 3
    return-void
.end method

.method e()I
    .locals 2

    .line 1
    iget-object v0, p0, Lo/g;->d:Lo/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lo/g;->e:Lo/f$c;

    .line 6
    .line 7
    invoke-static {v0, v1}, Lo/b;->b(Lo/f$d;Lo/f$c;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method f()Lo/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lo/g;->f:Lo/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo/a;

    .line 6
    .line 7
    new-instance v1, Lo/g$b;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lo/g$b;-><init>(Lo/g;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Lo/a;-><init>(Lo/a$d;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lo/g;->f:Lo/a;

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lo/g;->f:Lo/a;

    .line 18
    .line 19
    return-object v0
.end method

.method g()Landroidx/lifecycle/A;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->q:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->q:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->q:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method h()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->r:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->r:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->r:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method i()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->p:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->p:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->p:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method j()I
    .locals 1

    .line 1
    iget v0, p0, Lo/g;->j:I

    .line 2
    .line 3
    return v0
.end method

.method k()Lo/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->g:Lo/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo/h;

    .line 6
    .line 7
    invoke-direct {v0}, Lo/h;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->g:Lo/h;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->g:Lo/h;

    .line 13
    .line 14
    return-object v0
.end method

.method l()Lo/f$a;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->c:Lo/f$a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo/g$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lo/g$a;-><init>(Lo/g;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->c:Lo/f$a;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->c:Lo/f$a;

    .line 13
    .line 14
    return-object v0
.end method

.method m()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lo/g$c;

    .line 7
    .line 8
    invoke-direct {v0}, Lo/g$c;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method n()Lo/f$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->e:Lo/f$c;

    .line 2
    .line 3
    return-object v0
.end method

.method o()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->d:Lo/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lo/f$d;->b()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method p()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->y:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->y:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->y:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method q()I
    .locals 1

    .line 1
    iget v0, p0, Lo/g;->w:I

    .line 2
    .line 3
    return v0
.end method

.method r()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->x:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->x:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->x:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method s()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lo/g;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lo/b;->d(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-static {v0}, Lo/b;->c(I)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    return v0

    .line 19
    :cond_0
    const/4 v0, -0x1

    .line 20
    return v0
.end method

.method t()Landroid/content/DialogInterface$OnClickListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lo/g$d;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lo/g$d;-><init>(Lo/g;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 13
    .line 14
    return-object v0
.end method

.method u()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->i:Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lo/g;->d:Lo/f$d;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Lo/f$d;->c()Ljava/lang/CharSequence;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_1
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method v()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->d:Lo/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lo/f$d;->d()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method w()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->d:Lo/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lo/f$d;->e()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method x()Landroidx/lifecycle/x;
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->s:Landroidx/lifecycle/A;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/lifecycle/A;

    .line 6
    .line 7
    invoke-direct {v0}, Landroidx/lifecycle/A;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lo/g;->s:Landroidx/lifecycle/A;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Lo/g;->s:Landroidx/lifecycle/A;

    .line 13
    .line 14
    return-object v0
.end method

.method y()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lo/g;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method z()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lo/g;->d:Lo/f$d;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, Lo/f$d;->f()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method
