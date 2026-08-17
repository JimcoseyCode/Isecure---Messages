.class public final LF0/g$b$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LF0/g$b;->j(LF0/g$e;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:LF0/g$b;

.field final synthetic h:LF0/s;


# direct methods
.method constructor <init>(LF0/g$b;LF0/s;)V
    .locals 0

    .line 1
    iput-object p1, p0, LF0/g$b$a;->g:LF0/g$b;

    .line 2
    .line 3
    iput-object p2, p0, LF0/g$b$a;->h:LF0/s;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    const-string p2, "view"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-nez p2, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LF0/g$b$a;->g:LF0/g$b;

    .line 17
    .line 18
    invoke-virtual {p1}, LF0/g$b;->h()LF0/g$d;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1}, LF0/g$d;->a()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-nez p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, LF0/g$b$a;->g:LF0/g$b;

    .line 29
    .line 30
    iget-object p2, p0, LF0/g$b$a;->h:LF0/s;

    .line 31
    .line 32
    invoke-virtual {p1, p2}, LF0/g$b;->d(LF0/s;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_1
    iget-object p1, p0, LF0/g$b$a;->g:LF0/g$b;

    .line 37
    .line 38
    iget-object p2, p0, LF0/g$b$a;->h:LF0/s;

    .line 39
    .line 40
    invoke-static {p1, p2}, LF0/g$b;->c(LF0/g$b;LF0/s;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
