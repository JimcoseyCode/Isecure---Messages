.class Lx1/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/a;-><init>(ZLjava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Lx1/a;


# direct methods
.method constructor <init>(Lx1/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/a$b;->g:Lx1/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/a$b;->g:Lx1/a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/a;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
