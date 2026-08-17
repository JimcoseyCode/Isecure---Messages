.class LD3/a$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LD3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LD3/a;


# direct methods
.method constructor <init>(LD3/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LD3/a$b;->g:LD3/a;

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
    iget-object v0, p0, LD3/a$b;->g:LD3/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LD3/a;->invalidateSelf()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
