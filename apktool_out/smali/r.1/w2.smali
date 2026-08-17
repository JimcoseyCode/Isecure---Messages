.class public final synthetic Lr/w2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lr/x2;

.field public final synthetic h:Landroidx/concurrent/futures/c$a;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lr/x2;Landroidx/concurrent/futures/c$a;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/w2;->g:Lr/x2;

    .line 5
    .line 6
    iput-object p2, p0, Lr/w2;->h:Landroidx/concurrent/futures/c$a;

    .line 7
    .line 8
    iput p3, p0, Lr/w2;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr/w2;->g:Lr/x2;

    .line 2
    .line 3
    iget-object v1, p0, Lr/w2;->h:Landroidx/concurrent/futures/c$a;

    .line 4
    .line 5
    iget v2, p0, Lr/w2;->i:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lr/x2;->a(Lr/x2;Landroidx/concurrent/futures/c$a;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
