.class public final Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lx7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/BaseReactPackage;->getNativeModuleIterator$ReactAndroid_release(Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/Iterable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "Lcom/facebook/react/bridge/ModuleHolder;",
        ">;",
        "Lx7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1",
        "",
        "",
        "iterator",
        "()Ljava/util/Iterator;",
        "kotlin-stdlib"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $entrySetIterator$inlined:Ljava/util/Iterator;

.field final synthetic $reactContext$inlined:Lcom/facebook/react/bridge/ReactApplicationContext;

.field final synthetic this$0:Lcom/facebook/react/BaseReactPackage;


# direct methods
.method public constructor <init>(Ljava/util/Iterator;Lcom/facebook/react/BaseReactPackage;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1;->$entrySetIterator$inlined:Ljava/util/Iterator;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1;->this$0:Lcom/facebook/react/BaseReactPackage;

    .line 4
    .line 5
    iput-object p3, p0, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1;->$reactContext$inlined:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/facebook/react/bridge/ModuleHolder;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$1$1;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1;->$entrySetIterator$inlined:Ljava/util/Iterator;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1;->this$0:Lcom/facebook/react/BaseReactPackage;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$$inlined$Iterable$1;->$reactContext$inlined:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/react/BaseReactPackage$getNativeModuleIterator$1$1;-><init>(Ljava/util/Iterator;Lcom/facebook/react/BaseReactPackage;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
