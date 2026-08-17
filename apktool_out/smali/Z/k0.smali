.class public final synthetic LZ/k0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic h:LF/k1$b;

.field public final synthetic i:LF/r;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicBoolean;LF/k1$b;LF/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LZ/k0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 5
    .line 6
    iput-object p2, p0, LZ/k0;->h:LF/k1$b;

    .line 7
    .line 8
    iput-object p3, p0, LZ/k0;->i:LF/r;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/k0;->g:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 2
    .line 3
    iget-object v1, p0, LZ/k0;->h:LF/k1$b;

    .line 4
    .line 5
    iget-object v2, p0, LZ/k0;->i:LF/r;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, LZ/m0;->l0(Ljava/util/concurrent/atomic/AtomicBoolean;LF/k1$b;LF/r;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
