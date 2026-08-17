.class public interface abstract LB8/f$f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB8/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "f"
.end annotation


# static fields
.field public static final a:LB8/f$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LB8/f$f$a;

    .line 2
    .line 3
    invoke-direct {v0}, LB8/f$f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LB8/f$f;->a:LB8/f$f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public abstract handleException(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
.end method
