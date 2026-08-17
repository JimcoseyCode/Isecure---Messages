.class Lm2/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm2/a;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Lm2/e;

.field final synthetic h:Lm2/a;


# direct methods
.method constructor <init>(Lm2/a;Lm2/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm2/a$b;->h:Lm2/a;

    .line 2
    .line 3
    iput-object p2, p0, Lm2/a$b;->g:Lm2/e;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm2/a$b;->g:Lm2/e;

    .line 2
    .line 3
    iget-object v1, p0, Lm2/a$b;->h:Lm2/a;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lm2/e;->onProgressUpdate(Lm2/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
