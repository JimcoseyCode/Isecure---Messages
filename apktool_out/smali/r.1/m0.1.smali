.class public final synthetic Lr/m0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/concurrent/futures/c$c;


# instance fields
.field public final synthetic a:Lr/h0$d;

.field public final synthetic b:LF/h0$a;


# direct methods
.method public synthetic constructor <init>(Lr/h0$d;LF/h0$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/m0;->a:Lr/h0$d;

    .line 5
    .line 6
    iput-object p2, p0, Lr/m0;->b:LF/h0$a;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr/m0;->a:Lr/h0$d;

    .line 2
    .line 3
    iget-object v1, p0, Lr/m0;->b:LF/h0$a;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lr/h0$d;->e(Lr/h0$d;LF/h0$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
