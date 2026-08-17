.class public Lr/g2$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/g2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:Ljava/util/concurrent/ScheduledExecutorService;

.field private final c:Landroid/os/Handler;

.field private final d:Lr/p1;

.field private final e:LF/g1;

.field private final f:LF/g1;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;Lr/p1;LF/g1;LF/g1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/g2$b;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lr/g2$b;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 7
    .line 8
    iput-object p3, p0, Lr/g2$b;->c:Landroid/os/Handler;

    .line 9
    .line 10
    iput-object p4, p0, Lr/g2$b;->d:Lr/p1;

    .line 11
    .line 12
    iput-object p5, p0, Lr/g2$b;->e:LF/g1;

    .line 13
    .line 14
    iput-object p6, p0, Lr/g2$b;->f:LF/g1;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method a()Lr/g2$a;
    .locals 7

    .line 1
    new-instance v0, Lr/q2;

    .line 2
    .line 3
    iget-object v1, p0, Lr/g2$b;->e:LF/g1;

    .line 4
    .line 5
    iget-object v2, p0, Lr/g2$b;->f:LF/g1;

    .line 6
    .line 7
    iget-object v3, p0, Lr/g2$b;->d:Lr/p1;

    .line 8
    .line 9
    iget-object v4, p0, Lr/g2$b;->a:Ljava/util/concurrent/Executor;

    .line 10
    .line 11
    iget-object v5, p0, Lr/g2$b;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 12
    .line 13
    iget-object v6, p0, Lr/g2$b;->c:Landroid/os/Handler;

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lr/q2;-><init>(LF/g1;LF/g1;Lr/p1;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
